/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-06-03
 */
package com.avatech.edi.akcrm.repository;

import com.avatech.edi.akcrm.model.bo.items.Items;
import org.springframework.stereotype.Component;
import java.util.List;

public interface ItemsRepository{

    void saveItems(Items Items);

    List<Items> fetchItems();
}