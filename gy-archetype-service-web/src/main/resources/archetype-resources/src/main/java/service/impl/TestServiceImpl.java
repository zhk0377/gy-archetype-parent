package ${package}.service.impl;

import ${package}.dto.BaseDTO;
import ${package}.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service("testService")
public class TestServiceImpl implements TestService {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public BaseDTO test() {
        BaseDTO dto = new BaseDTO();
        dto.setSuccess(true);
        dto.setMessage("测试");
        logger.debug("测试service日志");
        return dto;
    }

}
