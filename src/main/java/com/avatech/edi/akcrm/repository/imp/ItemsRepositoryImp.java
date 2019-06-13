/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-06-03
 */
package com.avatech.edi.akcrm.repository.imp;

import com.avatech.edi.akcrm.model.bo.items.Items;
import com.avatech.edi.akcrm.mapper.ItemsMapper;
import com.avatech.edi.akcrm.repository.ItemsRepository;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;

@Component
public class ItemsRepositoryImp implements ItemsRepository{
    @Autowired
    private ItemsMapper itemsMapper;


    public void saveItems(Items items){
        itemsMapper.insertItems(items);

    }

    public List<Items> fetchItems(){
        List<Items> itemss = new ArrayList();
        itemss = itemsMapper.searchItems();
        return itemss;
    }
}