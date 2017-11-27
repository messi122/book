//package cn.tarena.book;
//
//import org.apache.shiro.authc.credential.CredentialsMatcher;
//import org.apache.shiro.mgt.SecurityManager;
//import org.apache.shiro.realm.Realm;
//import org.apache.shiro.spring.LifecycleBeanPostProcessor;
//import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
//import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
//import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
//import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.DependsOn;
//
//import cn.tarena.book.shiro.AuthCredentialMatcher;
//import cn.tarena.book.shiro.AuthRealm;
//import cn.tarena.book.user.utils.SpringUtil;
//
//@Configuration
//public class ShiroConfiguration {
//	@Bean
//	public SpringUtil getSpringUtil() {
//		return new SpringUtil();
//	}
//
//	@Bean
//	public AuthCredentialMatcher authCredentialMatcher() {
//		AuthCredentialMatcher authCredentialMatcher = new AuthCredentialMatcher();
//
//		return authCredentialMatcher;
//
//	}
//
//	@Bean(name = "lifecycleBeanPostProcessor")
//	public LifecycleBeanPostProcessor getLifecycleBeanPostProcessor() {
//		return new LifecycleBeanPostProcessor();
//	}
//
//	@Bean
//	@DependsOn(value = { "getSpringUtil",
//			"authCredentialMatcher" })
//	public AuthRealm authRealm() {
//
//		AuthRealm authRealm = new AuthRealm();
//		authRealm.setCredentialsMatcher(
//				(CredentialsMatcher) SpringUtil
//						.getBean("authCredentialMatcher"));
//
//		return authRealm;
//
//	}
//
//	@Bean
//	@DependsOn(value = { "getSpringUtil", "authRealm" })
//	public DefaultWebSecurityManager securityManager() {
//		DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
//		securityManager.setRealm(
//				(Realm) SpringUtil.getBean("authRealm"));
//
//		return securityManager;
//
//	}
//
//	@Bean
//	@DependsOn(value = { "getSpringUtil", "securityManager" })
//	public AuthorizationAttributeSourceAdvisor getAuthorizationAttributeSourceAdvisor() {
//		AuthorizationAttributeSourceAdvisor aasa = new AuthorizationAttributeSourceAdvisor();
//		aasa.setSecurityManager((SecurityManager) SpringUtil
//				.getBean("securityManager"));
//		return new AuthorizationAttributeSourceAdvisor();
//	}
//
//	//	@Bean
//	//	@DependsOn(value = { "getSpringUtil", "securityManager" })
//	//	public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor() {
//	//		AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor = new AuthorizationAttributeSourceAdvisor();
//	//
//	//		//		SpringUtil.getBean("authRealm");
//	//
//	//		//		advisor.setSecurityManager((SecurityManager) SpringUtil
//	//		//				.getBean("securityManager"));
//	//
//	//		return authorizationAttributeSourceAdvisor;
//	//	}
//
//	//	@Bean
//	//	@DependsOn(value = { "getSpringUtil", "securityManager" })
//	//	public ShiroFilterFactoryBean shiroFilter() {
//	//		ShiroFilterFactoryBean shiroFilter = new ShiroFilterFactoryBean();
//	//		shiroFilter
//	//				.setSecurityManager((SecurityManager) SpringUtil
//	//						.getBean("securityManager"));
//	//
//	//		return shiroFilter;
//	//	}
//
//}

package cn.tarena.book;

import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cn.tarena.book.shiro.AuthCredentialMatcher;
import cn.tarena.book.shiro.AuthRealm;

@Configuration
public class ShiroConfiguration {

	@Bean
	public AuthCredentialMatcher authCredentialMatcher() {
		AuthCredentialMatcher authCredentialMatcher = new AuthCredentialMatcher();

		return authCredentialMatcher;

	}

	@Bean(name = "AuthRealm")
	public AuthRealm getShiroRealm() {

		AuthRealm authRealm = new AuthRealm();
		authRealm.setCredentialsMatcher(authCredentialMatcher());
		return authRealm;
	}

	@Bean(name = "lifecycleBeanPostProcessor")
	public LifecycleBeanPostProcessor getLifecycleBeanPostProcessor() {
		return new LifecycleBeanPostProcessor();
	}

	@Bean
	public DefaultAdvisorAutoProxyCreator getDefaultAdvisorAutoProxyCreator() {
		DefaultAdvisorAutoProxyCreator daap = new DefaultAdvisorAutoProxyCreator();
		daap.setProxyTargetClass(true);
		return daap;
	}

	@Bean(name = "securityManager")
	public DefaultWebSecurityManager securityManager() {
		DefaultWebSecurityManager dwsm = new DefaultWebSecurityManager();
		dwsm.setRealm(getShiroRealm());
		return dwsm;
	}

	@Bean
	public AuthorizationAttributeSourceAdvisor getAuthorizationAttributeSourceAdvisor() {
		AuthorizationAttributeSourceAdvisor aasa = new AuthorizationAttributeSourceAdvisor();
		aasa.setSecurityManager(securityManager());
		return aasa;
	}

	@Bean(name = "shiroFilter")
	public ShiroFilterFactoryBean getShiroFilterFactoryBean() {
		ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
		shiroFilterFactoryBean
				.setSecurityManager(securityManager());
		return shiroFilterFactoryBean;
	}

}