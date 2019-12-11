package com.xmu.oomall.mapper;

import com.xmu.oomall.domain.GoodsCategory;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface GoodsCategoryMapper {

    /**
     * 查看所有的分类
     * @return
     */
    List<GoodsCategory> listGoodsCategory();

    /**
     * 新建一个分类
     * @param goodsCategory
     * @return
     */
    Integer addGoodsCategory(GoodsCategory goodsCategory);

    /**
     * 查看单个分类信息
     * @param id
     * @return
     */
    GoodsCategory getGoodsCategoryById(Integer id);

    /**
     * 修改分类信息
     * @param goodsCategory
     * @return
     */
    Integer updateGoodsCategoryById(GoodsCategory goodsCategory);

    /**
     * 删除单个分类
     * @param id
     * @return
     */
    Integer deleteGoodsCategory(Integer id);

    /**
     * 查看所有一级分类
     * @return
     */
    List<GoodsCategory> listOneLevelGoodsCategory();

    /**
     * 获取当前一级分类下的二级分类
     *
     * @param id 分类类目ID
     * @return 当前分类栏目
     */
    List<GoodsCategory> listSecondLevelGoodsCategoryById(Integer id);
}