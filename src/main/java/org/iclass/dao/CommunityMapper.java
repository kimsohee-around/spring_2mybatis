package org.iclass.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.iclass.vo.Community;
import org.springframework.stereotype.Component;


@Mapper					// 이 애노테이션이 붙은 인터페이스를 프록시가 구현체 만들어 줍니다.
public interface CommunityMapper {

	int insert(Community vo);
	int update(Community vo);
	int delete(long idx);
	Community selectByIdx(long idx);
	int count();
	long setReadCount();
	long commentsCount(long mref);
	int maxOf();
	List<Community> list();
}
