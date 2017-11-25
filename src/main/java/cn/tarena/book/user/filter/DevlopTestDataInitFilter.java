package cn.tarena.book.user.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import cn.tarena.book.pojo.User;
import cn.tarena.book.pojo.UserInfo;

public class DevlopTestDataInitFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig)
			throws ServletException {
		
	}

	@Override
	public void doFilter(ServletRequest request,
			ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		String userInfoId = "100";
		String nickname = "史诗之狐";
		String email = "55@qq.com";
		String address = "广东省 深圳市 南山区 腾讯大厦 5楼";
		String cardNo = "436582199605060018";
		Integer score = 200;
		String telephone = "13635428756";
		String gender = "男";
		UserInfo userInfo = new UserInfo(userInfoId, nickname,
				email, address, cardNo, score, telephone,
				gender);

		String id = userInfoId;
		String username = "arti";
		String password = "123456";
		Integer state = 1;

		User user = new User(id, username, password, state,
				userInfo);
		
//		(httpservletrequest)request
//		session.setAttribute("_CURRENT_USER", user);
			
	}

	@Override
	public void destroy() {
		
	}

}