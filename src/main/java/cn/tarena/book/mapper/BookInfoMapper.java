package cn.tarena.book.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.tarena.book.pojo.Book;
import cn.tarena.book.pojo.BookInfo;

public interface BookInfoMapper {

	/**
	 * 保存书籍详情
	 * @param bookInfo
	 */
	void saveBookUpload(BookInfo bookInfo);
	
	/** 分页查询功能
	 * @param userId 用户Id
	 * @param i	当前行数
	 * @param y	需要获取的行数
	 * @return
	 */
	List<Book> tocart(@Param("userId")String userId,@Param("i")int i,@Param("y")int y);
	
	/** 获取该用户所有书籍的行数
	 * @param id 用户Id
	 * @return
	 */
	Integer line(String id);
	
	/** 查询前四本新上架的书籍
	 * @return:book对象
	 */
	List <Book> findNewBooks();

	/** 根据书籍id查询书籍详情
	 * @param bookId:书籍Id
	 * @return
	 */
	Book findOneByBookId(String bookId);
	
	/**查询书籍详情
	 * @return:书籍详情
	 */
	List<BookInfo> findAll();

	/**查询相关书籍
	 * @param bookId 
	 * @param category:书籍分类
	 * @return
	 */
	List<Book> findRelateBooks(@Param("category")String category, @Param("bookId")String bookId);
	
	/**查询所有的书籍
	 * @return
	 */
	List<Book> findAllCategory();

	/**点击详情增加一次搜索次数
	 * @param bookId
	 */
	void addSearchVolume(String bookId);

}

