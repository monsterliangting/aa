package com.deepexi.pay.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.deepexi.pay.domain.ProductDO;
import com.deepexi.pay.domain.ProductDTO;
import com.deepexi.pay.domain.ProductQuery;
import com.deepexi.pay.enums.ResultEnum;
import com.deepexi.pay.mapper.ProductMapper;
import com.deepexi.pay.service.ProductService;
import com.deepexi.util.extension.ApplicationException;
import com.deepexi.util.pojo.ObjectCloneUtils;
import com.github.pagehelper.PageHelper;

/**
 * 产品Service组件实现
 * @author yangxi
 *
 */
@Service
public class ProductServiceImpl implements ProductService {

    private static final Logger