package com.sjs.storage.netty;

import io.netty.channel.ChannelId;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;

import java.util.concurrent.ConcurrentHashMap;

public class MyChannelHandlerPool {

    public MyChannelHandlerPool(){}

    public static ConcurrentHashMap<String, ChannelId> channelIdMap = new ConcurrentHashMap<>();

    public static ChannelGroup channelGroup = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);

}