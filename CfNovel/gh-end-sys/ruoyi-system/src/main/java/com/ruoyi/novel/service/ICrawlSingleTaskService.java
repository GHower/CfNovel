package com.ruoyi.novel.service;

import java.util.List;
import com.ruoyi.novel.domain.CrawlSingleTask;

/**
 * 抓取单本小说任务Service接口
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
public interface ICrawlSingleTaskService 
{
    /**
     * 查询抓取单本小说任务
     * 
     * @param id 抓取单本小说任务主键
     * @return 抓取单本小说任务
     */
    public CrawlSingleTask selectCrawlSingleTaskById(Long id);

    /**
     * 查询抓取单本小说任务列表
     * 
     * @param crawlSingleTask 抓取单本小说任务
     * @return 抓取单本小说任务集合
     */
    public List<CrawlSingleTask> selectCrawlSingleTaskList(CrawlSingleTask crawlSingleTask);

    /**
     * 新增抓取单本小说任务
     * 
     * @param crawlSingleTask 抓取单本小说任务
     * @return 结果
     */
    public int insertCrawlSingleTask(CrawlSingleTask crawlSingleTask);

    /**
     * 修改抓取单本小说任务
     * 
     * @param crawlSingleTask 抓取单本小说任务
     * @return 结果
     */
    public int updateCrawlSingleTask(CrawlSingleTask crawlSingleTask);

    /**
     * 批量删除抓取单本小说任务
     * 
     * @param ids 需要删除的抓取单本小说任务主键集合
     * @return 结果
     */
    public int deleteCrawlSingleTaskByIds(Long[] ids);

    /**
     * 删除抓取单本小说任务信息
     * 
     * @param id 抓取单本小说任务主键
     * @return 结果
     */
    public int deleteCrawlSingleTaskById(Long id);
}
