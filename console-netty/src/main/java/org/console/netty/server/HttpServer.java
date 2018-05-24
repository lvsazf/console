package org.console.netty.server;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;

public class HttpServer implements Server {
	
	private int port;
	
	@Override
	public void start(int port) {
		var server = new ServerBootstrap();
		var bossGroup = new NioEventLoopGroup();
		var workerGroup = new NioEventLoopGroup();
		server.group(bossGroup, workerGroup).channel(NioServerSocketChannel.class)
				.childHandler(new ChannelInitializer<SocketChannel>() {

					@Override
					protected void initChannel(SocketChannel ch) throws Exception {
						ch.pipeline().addLast();
					}
				});
	}

}
