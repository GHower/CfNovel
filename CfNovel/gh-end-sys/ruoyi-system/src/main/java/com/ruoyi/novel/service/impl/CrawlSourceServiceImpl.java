package com.ruoyi.novel.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.novel.mapper.CrawlSourceMapper;
import com.ruoyi.novel.domain.CrawlSource;
import com.ruoyi.novel.service.ICrawlSourceService;

/**
 * 爬虫源Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
@Service
public class CrawlSourceServiceImpl implements ICrawlSourceService 
{
    @Autowired
    private CrawlSourceMapper crawlSourceMapper;

    /**
     * 查询爬虫源
     * 
     * @param id 爬虫源主键
     * @return 爬虫源
     */
    @Override
    public CrawlSource selectCrawlSourceById(Long id)
    {
        return crawlSourceMapper.selectCrawlSourceById(id);
    }

    /**
     * 查询爬虫源列表
     * 
     * @param crawlSource 爬虫源
     * @return 爬虫源
     */
    @Override
    public List<CrawlSource> selectCrawlSourceList(CrawlSource crawlSource)
    {
        return crawlSourceMapper.selectCrawlSourceList(crawlSource);
    }

    /**
     * 新增爬虫源
     * 
     * @param crawlSource 爬虫源
     * @return 结果
     */
    @Override
    public int insertCrawlSource(CrawlSource crawlSource)
    {
        crawlSource.setCreateTime(DateUtils.getNowDate());
        return crawlSourceMapper.insertCrawlSource(crawlSource);
    }

    /**
     * 修改爬虫源
     * 
     * @param crawlSource 爬虫源
     * @return 结果
     */
    @Override
    public int updateCrawlSource(CrawlSource crawlSource)
    {
        crawlSource.setUpdateTime(DateUtils.getNowDate());
        return crawlSourceMapper.updateCrawlSource(crawlSource);
    }

    /**
     * 批量删除爬虫源
     * 
     * @param ids 需要删除的爬虫源主键
     * @return 结果
     */
    @Override
    public int deleteCrawlSourceByIds(Long[] ids)
    {
        return crawlSourceMapper.deleteCrawlSourceByIds(ids);
    }

    /**
     * 删除爬虫源信息
     * 
     * @param id 爬虫源主键
     * @return 结果
     */
    @Override
    public int deleteCrawlSourceById(Long id)
    {
        return crawlSourceMapper.deleteCrawlSourceById(id);
    }
}
