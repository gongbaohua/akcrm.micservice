/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-06-03
 */
package com.avatech.edi.akcrm.mapper;


import com.avatech.edi.akcrm.model.bo.items.Items;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public interface ItemsMapper{

    void insertItems(Items Items);

    List<Items> searchItems();
}