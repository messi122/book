package cn.tarena.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tarena.book.mapper.BookInfoMapper;

import cn.tarena.book.pojo.BookInfo;
import cn.tarena.book.pojo.UserInfo;


@Service
public class BookInfoServiceImpl  implements BookInfoService{

	@Autowired
	private BookInfoMapper bookInfoMapper;
	@Override

	public void saveBookUpload(BookInfo bookInfo) {
		bookInfoMapper.saveBookUpload(bookInfo);


  }
	@Override
	public List<UserInfo> tocart(String userId) {
		return bookInfoMapper.tocart(userId);
	}
}