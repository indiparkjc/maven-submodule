package study.spring.mybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import study.spring.mybatis.dao.BoardDao;
import study.spring.mybatis.mapper.BoardMapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BoardService {

    @Autowired
    private BoardDao boardDao;

    @Autowired
    private BoardMapper boardMapper;

    public List<Map> test() throws Exception {
        return boardDao.getList();
    }

    public List<HashMap> test2() throws Exception {
        return boardMapper.selectTest();
    }
    public List<HashMap> test3() throws Exception {
        return boardMapper.selectTest2();
    }

    @Transactional
    public void delete(){

    }
}
