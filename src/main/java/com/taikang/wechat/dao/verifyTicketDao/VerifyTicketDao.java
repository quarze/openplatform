package com.taikang.wechat.dao.verifyTicketDao;



import com.taikang.wechat.model.weChat.VerifyTicket;
import org.apache.ibatis.annotations.Mapper;


/**
 * @author: 张清森
 * @description 数据访问层接口
 * @date: Created in 14:28 2018/7/10
 */
@Mapper
public interface VerifyTicketDao {

    /**
     * 新增凭证数据
     *
     * @param verifyTicket 凭证
     */
    void insertTicketDao(VerifyTicket verifyTicket);

    /**
     * 查询凭证
     *
     * @return 凭证数据
     */
    VerifyTicket selectTicket();

    /**
     * 删除凭证
     */
    void deleteTicket(String id);
    /**
     * 查询最新凭证
     * @return 凭证信息
     */
    VerifyTicket selectTicketNewDao();

}
