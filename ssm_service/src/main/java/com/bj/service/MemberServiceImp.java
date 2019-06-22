package com.bj.service;

import com.bj.dao.MemberDao;
import com.bj.entity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MemberServiceImp implements MemberService {
    @Autowired
    private MemberDao memberDao;



    @Override
    public Member findById(String id) {
        return memberDao.findById(id);
    }
}
