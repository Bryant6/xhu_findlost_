package com.find.util;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.csource.common.MyException;
import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient1;
import org.csource.fastdfs.StorageServer;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;

public class DfsUtil {

	private static TrackerClient trackerClient = null;
	private static StorageClient1 storageClient1 = null;
	private static TrackerServer trackerServer = null;
	private static StorageServer storageServer = null;
	
	static {
		try {
			//ClientGlobal.init("D:\\eclipse-workspace\\xhu_findlost\\src\\main\\resources\\fastdfs-client.properties");
			ClientGlobal.init("/root/apache-tomcat-8.5.43/webapps/xhu_findlost/WEB-INF/classes/fastdfs-client.properties");
			trackerClient = new TrackerClient();
			trackerServer = trackerClient.getConnection();
			storageClient1 = new StorageClient1(trackerServer, storageServer);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String Upload(String filePath) throws IOException, MyException {	
		return storageClient1.upload_file1(filePath, null, null);
	}
}
