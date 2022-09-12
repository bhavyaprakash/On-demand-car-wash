package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.PromoModel;
import com.example.demo.repository.PromoRepository;

@Service
public class PromoService {
    @Autowired
    private PromoRepository promoRepository;

    public void save (PromoModel promo){
        promoRepository.save(promo);
    }

    public List<PromoModel> findAll(){
        List<PromoModel> promoList = promoRepository.findAll();
        if(promoList.size()>0){
            return promoList;
        }
        return null;
    }

	public Object deleteById(String id) {
		// TODO Auto-generated method stub
		return null;
	}
}