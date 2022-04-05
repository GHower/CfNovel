package com.ruoyi.novel.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.novel.mapper.CrawlSingleTaskMapper;
import com.ruoyi.novel.domain.CrawlSingleTask;
import com.ruoyi.novel.service.ICrawlSingleTaskService;

/**
 * 抓取单本小说任务Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
@Service
public class CrawlSingleTaskServiceImpl implements ICrawlSingleTaskService 
{
    @Autowired
    private CrawlSingleTaskMapper crawlSingleTaskMapper;

    /**
     * 查询抓取单本小说任务
     * 
     * @param id 抓取单本小说任务主键
     * @return 抓取单本小说任务
     */
    @Override
    public CrawlSingleTask selectCrawlSingleTaskById(Long id)
    {
        return crawlSingleTaskMapper.selectCrawlSingleTaskById(id);
    }

    /**
     * 查询抓取单本小说任务列表
     * 
     * @param crawlSingleTask 抓取单本小说任务
     * @return 抓取单本小说任务
     */
    @Override
    public List<CrawlSingleTask> selectCrawlSingleTaskList(CrawlSingleTask crawlSingleTask)
    {
        return crawlSingleTaskMapper.selectCrawlSingleTaskList(crawlSingleTask);
    }

    /**
     * 新增抓取单本小说任务
     * 
     * @param crawlSingleTask 抓取单本小说任务
     * @return 结果
     */
    @Override
    public int insertCrawlSingleTask(CrawlSingleTask crawlSingleTask)
    {
        crawlSingleTask.setCreateTime(DateUtils.getNowDate());
        return crawlSingleTaskMapper.insertCrawlSingleTask(crawlSingleTask);
    }

    /**
     * 修改抓取单本小说任务
     * 
     * @param crawlSingleTask 抓取单本小说任务
     * @return 结果
     */
    @Override
    public int updateCrawlSingleTask(CrawlSingleTask crawlSingleTask)
    {
        return crawlSingleTaskMapper.updateCrawlSingleTask(crawlSingleTask);
    }

    /**
     * 批量删除抓取单本小说任务
     * 
     * @param ids 需要删除的抓取单本小说任务主键
     * @return 结果
     */
    @Override
    public int deleteCrawlSingleTaskByIds(Long[] ids)
    {
        return crawlSingleTaskMapper.deleteCrawlSingleTaskByIds(ids);
    }

    /**
     * 删除抓取单本小说任务信息
     * 
     * @param id 抓取单本小说任务主键
     * @return 结果
     */
    @Override
    public int deleteCrawlSingleTaskById(Long id)
    {
        return crawlSingleTaskMapper.deleteCrawlSingleTaskById(id);
    }
}
