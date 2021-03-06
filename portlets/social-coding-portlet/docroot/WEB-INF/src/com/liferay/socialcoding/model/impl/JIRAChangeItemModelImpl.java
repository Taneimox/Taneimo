/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.socialcoding.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.liferay.socialcoding.model.JIRAChangeItem;
import com.liferay.socialcoding.model.JIRAChangeItemModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the JIRAChangeItem service. Represents a row in the &quot;changeitem&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.socialcoding.model.JIRAChangeItemModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link JIRAChangeItemImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JIRAChangeItemImpl
 * @see com.liferay.socialcoding.model.JIRAChangeItem
 * @see com.liferay.socialcoding.model.JIRAChangeItemModel
 * @generated
 */
public class JIRAChangeItemModelImpl extends BaseModelImpl<JIRAChangeItem>
	implements JIRAChangeItemModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a j i r a change item model instance should use the {@link com.liferay.socialcoding.model.JIRAChangeItem} interface instead.
	 */
	public static final String TABLE_NAME = "changeitem";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "groupid", Types.BIGINT },
			{ "field", Types.VARCHAR },
			{ "oldValue", Types.VARCHAR },
			{ "oldString", Types.VARCHAR },
			{ "newValue", Types.VARCHAR },
			{ "newString", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table changeitem (id LONG not null primary key,groupid LONG,field VARCHAR(75) null,oldValue VARCHAR(75) null,oldString VARCHAR(75) null,newValue VARCHAR(75) null,newString VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table changeitem";
	public static final String ORDER_BY_JPQL = " ORDER BY jiraChangeItem.jiraChangeItemId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY changeitem.id ASC";
	public static final String DATA_SOURCE = "jiraDataSource";
	public static final String SESSION_FACTORY = "jiraSessionFactory";
	public static final String TX_MANAGER = "jiraTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.socialcoding.model.JIRAChangeItem"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.socialcoding.model.JIRAChangeItem"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.liferay.socialcoding.model.JIRAChangeItem"),
			true);
	public static long JIRACHANGEGROUPID_COLUMN_BITMASK = 1L;
	public static long JIRACHANGEITEMID_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.socialcoding.model.JIRAChangeItem"));

	public JIRAChangeItemModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _jiraChangeItemId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setJiraChangeItemId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _jiraChangeItemId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return JIRAChangeItem.class;
	}

	@Override
	public String getModelClassName() {
		return JIRAChangeItem.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("jiraChangeItemId", getJiraChangeItemId());
		attributes.put("jiraChangeGroupId", getJiraChangeGroupId());
		attributes.put("field", getField());
		attributes.put("oldValue", getOldValue());
		attributes.put("oldString", getOldString());
		attributes.put("newValue", getNewValue());
		attributes.put("newString", getNewString());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long jiraChangeItemId = (Long)attributes.get("jiraChangeItemId");

		if (jiraChangeItemId != null) {
			setJiraChangeItemId(jiraChangeItemId);
		}

		Long jiraChangeGroupId = (Long)attributes.get("jiraChangeGroupId");

		if (jiraChangeGroupId != null) {
			setJiraChangeGroupId(jiraChangeGroupId);
		}

		String field = (String)attributes.get("field");

		if (field != null) {
			setField(field);
		}

		String oldValue = (String)attributes.get("oldValue");

		if (oldValue != null) {
			setOldValue(oldValue);
		}

		String oldString = (String)attributes.get("oldString");

		if (oldString != null) {
			setOldString(oldString);
		}

		String newValue = (String)attributes.get("newValue");

		if (newValue != null) {
			setNewValue(newValue);
		}

		String newString = (String)attributes.get("newString");

		if (newString != null) {
			setNewString(newString);
		}
	}

	@Override
	public long getJiraChangeItemId() {
		return _jiraChangeItemId;
	}

	@Override
	public void setJiraChangeItemId(long jiraChangeItemId) {
		_jiraChangeItemId = jiraChangeItemId;
	}

	@Override
	public long getJiraChangeGroupId() {
		return _jiraChangeGroupId;
	}

	@Override
	public void setJiraChangeGroupId(long jiraChangeGroupId) {
		_columnBitmask |= JIRACHANGEGROUPID_COLUMN_BITMASK;

		if (!_setOriginalJiraChangeGroupId) {
			_setOriginalJiraChangeGroupId = true;

			_originalJiraChangeGroupId = _jiraChangeGroupId;
		}

		_jiraChangeGroupId = jiraChangeGroupId;
	}

	public long getOriginalJiraChangeGroupId() {
		return _originalJiraChangeGroupId;
	}

	@Override
	public String getField() {
		if (_field == null) {
			return StringPool.BLANK;
		}
		else {
			return _field;
		}
	}

	@Override
	public void setField(String field) {
		_field = field;
	}

	@Override
	public String getOldValue() {
		if (_oldValue == null) {
			return StringPool.BLANK;
		}
		else {
			return _oldValue;
		}
	}

	@Override
	public void setOldValue(String oldValue) {
		_oldValue = oldValue;
	}

	@Override
	public String getOldString() {
		if (_oldString == null) {
			return StringPool.BLANK;
		}
		else {
			return _oldString;
		}
	}

	@Override
	public void setOldString(String oldString) {
		_oldString = oldString;
	}

	@Override
	public String getNewValue() {
		if (_newValue == null) {
			return StringPool.BLANK;
		}
		else {
			return _newValue;
		}
	}

	@Override
	public void setNewValue(String newValue) {
		_newValue = newValue;
	}

	@Override
	public String getNewString() {
		if (_newString == null) {
			return StringPool.BLANK;
		}
		else {
			return _newString;
		}
	}

	@Override
	public void setNewString(String newString) {
		_newString = newString;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			JIRAChangeItem.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public JIRAChangeItem toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (JIRAChangeItem)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		JIRAChangeItemImpl jiraChangeItemImpl = new JIRAChangeItemImpl();

		jiraChangeItemImpl.setJiraChangeItemId(getJiraChangeItemId());
		jiraChangeItemImpl.setJiraChangeGroupId(getJiraChangeGroupId());
		jiraChangeItemImpl.setField(getField());
		jiraChangeItemImpl.setOldValue(getOldValue());
		jiraChangeItemImpl.setOldString(getOldString());
		jiraChangeItemImpl.setNewValue(getNewValue());
		jiraChangeItemImpl.setNewString(getNewString());

		jiraChangeItemImpl.resetOriginalValues();

		return jiraChangeItemImpl;
	}

	@Override
	public int compareTo(JIRAChangeItem jiraChangeItem) {
		long primaryKey = jiraChangeItem.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof JIRAChangeItem)) {
			return false;
		}

		JIRAChangeItem jiraChangeItem = (JIRAChangeItem)obj;

		long primaryKey = jiraChangeItem.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		JIRAChangeItemModelImpl jiraChangeItemModelImpl = this;

		jiraChangeItemModelImpl._originalJiraChangeGroupId = jiraChangeItemModelImpl._jiraChangeGroupId;

		jiraChangeItemModelImpl._setOriginalJiraChangeGroupId = false;

		jiraChangeItemModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<JIRAChangeItem> toCacheModel() {
		JIRAChangeItemCacheModel jiraChangeItemCacheModel = new JIRAChangeItemCacheModel();

		jiraChangeItemCacheModel.jiraChangeItemId = getJiraChangeItemId();

		jiraChangeItemCacheModel.jiraChangeGroupId = getJiraChangeGroupId();

		jiraChangeItemCacheModel.field = getField();

		String field = jiraChangeItemCacheModel.field;

		if ((field != null) && (field.length() == 0)) {
			jiraChangeItemCacheModel.field = null;
		}

		jiraChangeItemCacheModel.oldValue = getOldValue();

		String oldValue = jiraChangeItemCacheModel.oldValue;

		if ((oldValue != null) && (oldValue.length() == 0)) {
			jiraChangeItemCacheModel.oldValue = null;
		}

		jiraChangeItemCacheModel.oldString = getOldString();

		String oldString = jiraChangeItemCacheModel.oldString;

		if ((oldString != null) && (oldString.length() == 0)) {
			jiraChangeItemCacheModel.oldString = null;
		}

		jiraChangeItemCacheModel.newValue = getNewValue();

		String newValue = jiraChangeItemCacheModel.newValue;

		if ((newValue != null) && (newValue.length() == 0)) {
			jiraChangeItemCacheModel.newValue = null;
		}

		jiraChangeItemCacheModel.newString = getNewString();

		String newString = jiraChangeItemCacheModel.newString;

		if ((newString != null) && (newString.length() == 0)) {
			jiraChangeItemCacheModel.newString = null;
		}

		return jiraChangeItemCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{jiraChangeItemId=");
		sb.append(getJiraChangeItemId());
		sb.append(", jiraChangeGroupId=");
		sb.append(getJiraChangeGroupId());
		sb.append(", field=");
		sb.append(getField());
		sb.append(", oldValue=");
		sb.append(getOldValue());
		sb.append(", oldString=");
		sb.append(getOldString());
		sb.append(", newValue=");
		sb.append(getNewValue());
		sb.append(", newString=");
		sb.append(getNewString());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.liferay.socialcoding.model.JIRAChangeItem");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>jiraChangeItemId</column-name><column-value><![CDATA[");
		sb.append(getJiraChangeItemId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>jiraChangeGroupId</column-name><column-value><![CDATA[");
		sb.append(getJiraChangeGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>field</column-name><column-value><![CDATA[");
		sb.append(getField());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>oldValue</column-name><column-value><![CDATA[");
		sb.append(getOldValue());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>oldString</column-name><column-value><![CDATA[");
		sb.append(getOldString());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>newValue</column-name><column-value><![CDATA[");
		sb.append(getNewValue());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>newString</column-name><column-value><![CDATA[");
		sb.append(getNewString());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = JIRAChangeItem.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			JIRAChangeItem.class
		};
	private long _jiraChangeItemId;
	private long _jiraChangeGroupId;
	private long _originalJiraChangeGroupId;
	private boolean _setOriginalJiraChangeGroupId;
	private String _field;
	private String _oldValue;
	private String _oldString;
	private String _newValue;
	private String _newString;
	private long _columnBitmask;
	private JIRAChangeItem _escapedModel;
}