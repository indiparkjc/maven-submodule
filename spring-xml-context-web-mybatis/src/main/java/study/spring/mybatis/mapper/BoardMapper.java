package study.spring.mybatis.mapper;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public interface BoardMapper {
    List<HashMap> selectTest();
    @Select("SELECT * FROM board WHERE idx=1")
    List<HashMap> selectTest2();

}
