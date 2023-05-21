package cn.timelost.hr;


import cn.hutool.json.JSON;
import cn.hutool.json.JSONUtil;
import cn.timelost.hr.service.PersonalService;
import cn.timelost.hr.vo.input.PersonalForm;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.time.Period;

@SpringBootTest
class ApplicationTests {
    @Resource
    PersonalService
            personalService;
    @Test
    void contextLoads() {
        String str ="{\"id\":\"\",\"name\":\"更新\",\"birthday\":\"2023-05-10\",\"phone\":\"18888888888\",\"email\":\"xxxx@qq.com\",\"gender\":\"2\",\"identity\":\"430600199112200000\",\"education\":\"大专\",\"school\":\"xxx大学\",\"departmentId\":\"1\",\"positionId\":\"1\",\"workStatus\":\"1\",\"imgUrl\":\"\",\"file\":\"\"}";
        PersonalForm personalForm = JSONUtil.toBean(str, PersonalForm.class);
        personalService.insert(personalForm);
    }
}
