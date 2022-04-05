package com.ruoyi.novel.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.novel.mapper.CrawlBatchTaskMapper;
import com.ruoyi.novel.domain.CrawlBatchTask;
import com.ruoyi.novel.service.ICrawlBatchTaskService;

/**
 * 批量抓取任务Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
@Service
public class CrawlBatchTaskServiceImpl implements ICrawlBatchTaskService 
{
    @Autowired
    private CrawlBatchTaskMapper crawlBatchTaskMapper;

    /**
     * 查询批量抓取任务
     * 
     * @param id 批量抓取任务主键
     * @return 批量抓取任务
     */
    @Override
    public CrawlBatchTask selectCrawlBatchTaskById(Long id)
    {
        return crawlBatchTaskMapper.selectCrawlBatchTaskById(id);
    }

    /**
     * 查询批量抓取任务列表
     * 
     * @param crawlBatchTask 批量抓取任务
     * @return 批量抓取任务
     */
    @Override
    public List<CrawlBatchTask> selectCrawlBatchTaskList(CrawlBatchTask crawlBatchTask)
    {
        return crawlBatchTaskMapper.selectCrawlBatchTaskList(crawlBatchTask);
    }

    /**
     * 新增批量抓取任务
     * 
     * @param crawlBatchTask 批量抓取任务
     * @return 结果
     */
    @Override
    public int insertCrawlBatchTask(CrawlBatchTask crawlBatchTask)
    {
        return crawlBatchTaskMapper.insertCrawlBatchTask(crawlBatchTask);
    }

    /**
     * 修改批量抓取任务
     * 
     * @param crawlBatchTask 批量抓取任务
     * @return 结果
     */
    @Override
    public int updateCrawlBatchTask(CrawlBatchTask crawlBatchTask)
    {
        return crawlBatchTaskMapper.updateCrawlBatchTask(crawlBatchTask);
    }

    /**
     * 批量删除批量抓取任务
     * 
     * @param ids 需要删除的批量抓取任务主键
     * @return 结果
     */
    @Override
    public int deleteCrawlBatchTaskByIds(Long[] ids)
    {
        return crawlBatchTaskMapper.deleteCrawlBatchTaskByIds(ids);
    }

    /**
     * 删除批量抓取任务信息
     * 
     * @param id 批量抓取任务主键
     * @return 结果
     */
    @Override
    public int deleteCrawlBatchTaskById(Long id)
    {
        return crawlBatchTaskMapper.deleteCrawlBatchTaskById(id);
    }
}
