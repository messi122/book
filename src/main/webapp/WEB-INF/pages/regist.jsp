<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="app" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Book Store</title>
<link rel="stylesheet" type="text/css" href="${app}/staticfile/css/style.css" />
</head>
<%@include file="_head.jsp" %>
<body>
<div id="wrap">

      <%--  <div class="header">
       		<div class="logo"><a href="index.html"><img src="${app}/staticfile/images/logo.gif" alt="" title="" border="0" /></a></div>            
        <div id="menu">
         <ul>                                                                       
      			<li id="back"><a href="#" onclick="window.history.back();">返回</a></li>
       <!--      <li><a href="index.html"></a></li>
            <li><a href="about.html"></a></li>
            <li><a href="category.html"></a></li>
            <li><a href="specials.html"></a></li>
            <li><a href="myaccount.html"</a></li>
            <li class="selected"><a href="register.html"></a></li>
            <li><a href="details.html"></a></li>
            <li><a href="contact.html"></a></li> -->
            </ul> 
        </div>     
            
            
       </div>  --%>
       

       
       <div class="center_content">
       	<div class="left_content">
            <div class="title"><span class="title_icon"><img src="${app}/staticfile/images/bullet1.gif" alt="" title="" /></span>REGIST</div>
        
        	<div class="feat_prod_box_details">
            <p class="details">
            	欢迎注册jieshu，完成注册后请至个人中心完善信息。。。注册成功后将跳转至主页。。
            </p>
            
              	<div class="contact_form">
                <div class="form_subtitle">注册新用户</div>
                 	
                 	
                 	<div class="details">
				<c:if test="${!empty errorInfo}">
					${errorInfo}
				</c:if>
					</div>	
                 
                 
                 <form name="register" action="toregist.action">          
                    <div class="form_row">
                    <label class="contact"><strong>用户名:</strong></label>
                    <input name="username" type="text" class="contact_input" />
                    </div>  


                    <div class="form_row">
                    <label class="contact"><strong>密码:</strong></label>
                    <input name="password" type="password" class="contact_input" />
                    </div> 
                   
                    <div class="form_row">
                    <label class="contact"><strong>确认密码:</strong></label>
                    <input name="password2" type="password" class="contact_input" />
                    </div> 

                  <!--   <div class="form_row">
                    <label class="contact"><strong>Email:</strong></label>
                    <input type="text" class="contact_input" />
                    </div>


                    <div class="form_row">
                    <label class="contact"><strong>Phone:</strong></label>
                    <input type="text" class="contact_input" />
                    </div>
                    
                    <div class="form_row">
                    <label class="contact"><strong>Company:</strong></label>
                    <input type="text" class="contact_input" />
                    </div>
                    
                    <div class="form_row">
                    <label class="contact"><strong>Adrres:</strong></label>
                    <input type="text" class="contact_input" />
                    </div>      -->               

                  <!--   <div class="form_row">
                        <div class="terms">
                        <input type="checkbox" name="terms" />
                        I agree to the <a href="#">terms &amp; conditions</a>                        </div>
                    </div>  -->

                    
                    <div class="form_row">
                    <input type="submit" class="register" value="注册" />
                    </div>   
                  </form>     
                </div>  
            
          </div>	
            
              

            

            
        <div class="clear"></div>
        </div><!--end of left content-->
        
        <div class="right_content">
        
                	<div class="languages_box">

            <span class="red">Languages:</span>
            <a href="#"><img src="${app}/staticfile/images/gb.gif" alt="" title="" border="0" /></a>
            <a href="#"><img src="${app}/staticfile/images/fr.gif" alt="" title="" border="0" /></a>
            <a href="#"><img src="${app}/staticfile/images/de.gif" alt="" title="" border="0" /></a>

            </div>
                <div class="currency">
                <span class="red"> </span>
                <a href="#"></a>
                <a href="#"></a>
                <a href="#"><strong></strong></a>
                </div>
                
                
              <div class="cart">

                  <div class="title"><span class="title_icon"><img src="${app}/staticfile/images/cart.gif" alt="" title="" /></span>My cart</div>

                  <div class="home_cart_content">
                  <span class="red"></span>
                  </div>

                  <a href="/tocart" class="view_cart">view cart</a>

              </div>
        
             <div class="title"><span class="title_icon"><img src="${app}/staticfile/images/bullet3.gif" alt="" title="" /></span>About Our Store</div> 
             <div class="about">
             <p>
             <img src="images/about.gif" alt="" title="" class="right" />
           
             </p>
             
             </div>
             
             <div class="right_box">
             

             	<div class="title"><span class="title_icon"><img src="${app}/staticfile/images/bullet4.gif" alt="" title="" /></span>Promotions</div> 

                    <div class="new_prod_box">
                        <a href="details.html"></a>
                        <div class="new_prod_bg">
                        <span class="new_icon"><img src="${app}/staticfile/images/promo_icon.gif" alt="" title="" /></span>
                        <a href="details.html"><img src="${app}/staticfile/images/thumb1.gif" alt="" title="" class="thumb" border="0" /></a>
                        </div>           
                    </div>
                    
                    <div class="new_prod_box">
                        <a href="details.html"></a>
                        <div class="new_prod_bg">
                        <span class="new_icon"><img src="${app}/staticfile/images/promo_icon.gif" alt="" title="" /></span>
                        <a href="details.html"><img src="${app}/staticfile/images/thumb2.gif" alt="" title="" class="thumb" border="0" /></a>
                        </div>           
                    </div>                    
                    
                    <div class="new_prod_box">
                        <a href="details.html"></a>
                        <div class="new_prod_bg">
                        <span class="new_icon"><img src="${app}/staticfile/images/promo_icon.gif" alt="" title="" /></span>
                        <a href="details.html"><img src="${app}/staticfile/images/thumb3.gif" alt="" title="" class="thumb" border="0" /></a>
                        </div>           
                    </div>              
             
             </div>
             
             <div class="right_box">
             

             	<div class="title"><span class="title_icon"><img src="${app}/staticfile/images/bullet5.gif" alt="" title="" /></span>Categories</div> 

                <ul class="list">
                <li><a href="#"></a></li>
                <li><a href="#"></a></li>
                <li><a href="#"></a></li>
                <li><a href="#"></a></li>
                <li><a href="#"></a></li>
                <li><a href="#"></a></li>
                <li><a href="#"></a></li>
                <li><a href="#"></a></li>
                <li><a href="#"></a></li>
                <li><a href="#"></a></li>
                <li><a href="#"></a></li>                                              
                </ul>
                

             	<div class="title"><span class="title_icon"><img src="${app}/staticfile/images/bullet6.gif" alt="" title="" /></span>Partners</div> 

                
                <ul class="list">
                <li><a href="#"></a></li>
                <li><a href="#"></a></li>
                <li><a href="#"></a></li>
                <li><a href="#"></a></li>
                <li><a href="#"></a></li>
                <li><a href="#"></a></li>
                <li><a href="#"></a></li>
                <li><a href="#"></a></li>
                <li><a href="#"></a></li>                              
                </ul>      
             
             </div>         
             
        
        </div><!--end of right content-->
        
        
       
       
       <div class="clear"></div>
       </div><!--end of center content-->
       

       <%--        
       <div class="footer">

       	<div class="left_footer"><img src="${app}/staticfile/images/footer_logo.gif" alt="" title="" /><br /> <a href="http://www.cssmoban.com/" title="free templates">cssmoban</a></div>

        <div class="right_footer">
        <a href="#"></a>
        <a href="#"></a>
        <a href="#"></a>
        <a href="#"></a>
        <a href="#"></a>
       
        </div>
        
       
       </div> --%>

    

</div>

</body>
<%@include file="_foot.jsp" %>
</html>