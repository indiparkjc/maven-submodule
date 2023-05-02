package study.spring.mybatis.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class BoardDao {

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    public List<Map> getList() throws Exception {
        SqlSession session = sqlSessionFactory.openSession();
        return session.selectList( "study.spring.mybatis.dao.BoardDao.selectTest" );
    }

}
