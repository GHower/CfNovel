package com.ruoyi.novel.service;

import java.util.List;
import com.ruoyi.novel.domain.CrawlBatchTask;

/**
 * 批量抓取任务Service接口
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
public interface ICrawlBatchTaskService 
{
    /**
     * 查询批量抓取任务
     * 
     * @param id 批量抓取任务主键
     * @return 批量抓取任务
     */
    public CrawlBatchTask selectCrawlBatchTaskById(Long id);

    /**
     * 查询批量抓取任务列表
     * 
     * @param crawlBatchTask 批量抓取任务
     * @return 批量抓取任务集合
     */
    public List<CrawlBatchTask> selectCrawlBatchTaskList(CrawlBatchTask crawlBatchTask);

    /**
     * 新增批量抓取任务
     * 
     * @param crawlBatchTask 批量抓取任务
     * @return 结果
     */
    public int insertCrawlBatchTask(CrawlBatchTask crawlBatchTask);

    /**
     * 修改批量抓取任务
     * 
     * @param crawlBatchTask 批量抓取任务
     * @return 结果
     */
    public int updateCrawlBatchTask(CrawlBatchTask crawlBatchTask);

    /**
     * 批量删除批量抓取任务
     * 
     * @param ids 需要删除的批量抓取任务主键集合
     * @return 结果
     */
    public int deleteCrawlBatchTaskByIds(Long[] ids);

    /**
     * 删除批量抓取任务信息
     * 
     * @param id 批量抓取任务主键
     * @return 结果
     */
    public int deleteCrawlBatchTaskById(Long id);
}
