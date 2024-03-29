package kr.co.itcen.springcontainer.soundsystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.itcen.springcontainer.soundsystem.CDPlayer;
import kr.co.itcen.springcontainer.soundsystem.CompactDisc;

/**
 * Auto Configuration - xml config(Annotation Scan)
 * Component Scanning( @Component, @Named, @Autowired, @Inject ) -> Spring Container
 * @Service, @Controller, @Repository -> Spring MVC
 *
 */


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:config/soundsystem/SoundSystemConfig.xml"})
public class SoundSystemXmlConfigTest {
	
	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
	@Autowired
	@Qualifier("highSchoolRapper3Final")
	private CompactDisc cd;
	
	@Autowired
	private CDPlayer cdPlayer;
	
	@Test
	public void testCDNull(){
		assertNotNull(cd);
		
	}
	
	@Test
	public void testCDPlayer(){
		assertNotNull(cdPlayer);
	}
	
	// @Ignore
	@Test
	public void testPlay() {
		cdPlayer.play();
		assertEquals("Playing 지구멸망 by 양승호",systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
}
