/**
 * Created On : 11 Aug 2017
 */
package com.lk.meeting.room.controller.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.lk.meeting.room.config.RootConfig;
import com.lk.student.manager.web.config.WebMvcConfig;

/**
 * The Class AbstractControllerTest.
 * @author virtualpathum
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {WebMvcConfig.class, RootConfig.class})
@WebAppConfiguration
public abstract class AbstractControllerTest {

}
