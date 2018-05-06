package org.console.nio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * 使用Buffer读写数据一般遵循以下四个步骤：
 * 1/写入数据到Buffer
 * 2/调用flip()方法
 * 3/从Buffer中读取数据
 4 4/调用clear()方法或者compact()方法
 * @author lzs
 */
public class Buffer {
	public static void main(String[] args) {
		try {
			RandomAccessFile accessFile = new RandomAccessFile("D:\\SVN\\X5\\branches\\cloud-2.0.13\\model\\UI2\\system\\deploy\\app\\deploy.css", "r");
			FileChannel inChannel = accessFile.getChannel();
			ByteBuffer buffer = ByteBuffer.allocate(48);//缓冲区大小，字节
			int read = inChannel.read(buffer);//读取内容到缓冲区
			while(read != -1) {
				System.out.println("read::" + read);
				buffer.flip();//切换读写模式
				while(buffer.hasRemaining()) {
					System.out.print((char) buffer.get());
				}
				buffer.clear();//清空整个缓冲区
				buffer.compact();//清空已经读取过的数据
				read = inChannel.read(buffer);
			}
			accessFile.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
