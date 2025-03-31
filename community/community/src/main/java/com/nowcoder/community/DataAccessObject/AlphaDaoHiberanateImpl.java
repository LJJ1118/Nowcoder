package com.nowcoder.community.DataAccessObject;


import org.springframework.stereotype.Repository;

@Repository
public class AlphaDaoHiberanateImpl implements AlphaDao{

    @Override
    public String select() {
        return "Hiberanate";
    }
}

