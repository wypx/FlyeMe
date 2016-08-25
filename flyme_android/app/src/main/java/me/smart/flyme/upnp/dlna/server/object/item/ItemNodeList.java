/******************************************************************
*
*	MediaServer for CyberLink
*
*	Copyright (C) Satoshi Konno 2003
**
*	File: ItemNodeList.java
*
*	Revision;
*
*	11/11/03
*		- first revision.
*
******************************************************************/

package me.smart.flyme.upnp.dlna.server.object.item;

import java.util.Vector;

public class ItemNodeList extends Vector 
{
	public ItemNodeList() 
	{
	}
	
	public ItemNode getItemNode(int n)
	{
		return (ItemNode)get(n);
	}
}


