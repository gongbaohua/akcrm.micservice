/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-06-03
 */
package com.avatech.edi.akcrm.api;
import com.avatech.edi.akcrm.model.bo.items.Items;
import com.avatech.edi.akcrm.repository.ItemsRepository;
import com.avatech.edi.akcrm.service.ItemsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.transform.Result;
import java.util.List;


@RestController
@RequestMapping("v1/*")
public class ItemsController {

    private final Logger logger = LoggerFactory.getLogger(ItemsController.class);

    @Autowired
    private ItemsService itemsService;

    @Autowired
    private ItemsRepository itemsRepository;


    @GetMapping("items")
    public List<Items> getItems(){
        List<Items> list = itemsRepository.fetchItems();
        return  list;
    }


    @PostMapping("items")
    public @ResponseBody Result addItems(@RequestBody Items items){
        return null;
    }


}