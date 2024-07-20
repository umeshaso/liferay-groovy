import com.liferay.portal.kernel.service.ReleaseLocalServiceUtil;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.model.Release;

Release release = ReleaseLocalServiceUtil.createRelease(CounterLocalServiceUtil.increment());

release.setSchemaVersion("1.0.0");
release.setServletContextName("test.sb.service");
release.setBuildNumber(1);

out.println(ReleaseLocalServiceUtil.addRelease(release));
