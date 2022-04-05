package com.ruoyi.novel.service;

import java.util.List;
import com.ruoyi.novel.domain.CrawlSource;

/**
 * 爬虫源Service接口
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
public interface ICrawlSourceService 
{
    /**
     * 查询爬虫源
     * 
     * @param id 爬虫源主键
     * @return 爬虫源
     */
    public CrawlSource selectCrawlSourceById(Long id);

    /**
     * 查询爬虫源列表
     * 
     * @param crawlSource 爬虫源
     * @return 爬虫源集合
     */
    public List<CrawlSource> selectCrawlSourceList(CrawlSource crawlSource);

    /**
     * 新增爬虫源
     * 
     * @param crawlSource 爬虫源
     * @return 结果
     */
    public int insertCrawlSource(CrawlSource crawlSource);

    /**
     * 修改爬虫源
     * 
     * @param crawlSource 爬虫源
     * @return 结果
     */
    public int updateCrawlSource(CrawlSource crawlSource);

    /**
     * 批量删除爬虫源
     * 
     * @param ids 需要删除的爬虫源主键集合
     * @return 结果
     */
    public int deleteCrawlSourceByIds(Long[] ids);

    /**
     * 删除爬虫源信息
     * 
     * @param id 爬虫源主键
     * @return 结果
     */
    public int deleteCrawlSourceById(Long id);
}
