/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
/**
 * Autogenerated by Thrift Compiler (0.17.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.accumulo.core.dataImpl.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class TCondition implements org.apache.thrift.TBase<TCondition, TCondition._Fields>, java.io.Serializable, Cloneable, Comparable<TCondition> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TCondition");

  private static final org.apache.thrift.protocol.TField CF_FIELD_DESC = new org.apache.thrift.protocol.TField("cf", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField CQ_FIELD_DESC = new org.apache.thrift.protocol.TField("cq", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField CV_FIELD_DESC = new org.apache.thrift.protocol.TField("cv", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField TS_FIELD_DESC = new org.apache.thrift.protocol.TField("ts", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField HAS_TIMESTAMP_FIELD_DESC = new org.apache.thrift.protocol.TField("hasTimestamp", org.apache.thrift.protocol.TType.BOOL, (short)5);
  private static final org.apache.thrift.protocol.TField VAL_FIELD_DESC = new org.apache.thrift.protocol.TField("val", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField ITERATORS_FIELD_DESC = new org.apache.thrift.protocol.TField("iterators", org.apache.thrift.protocol.TType.STRING, (short)7);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TConditionStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TConditionTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer cf; // required
  public @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer cq; // required
  public @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer cv; // required
  public long ts; // required
  public boolean hasTimestamp; // required
  public @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer val; // required
  public @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer iterators; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CF((short)1, "cf"),
    CQ((short)2, "cq"),
    CV((short)3, "cv"),
    TS((short)4, "ts"),
    HAS_TIMESTAMP((short)5, "hasTimestamp"),
    VAL((short)6, "val"),
    ITERATORS((short)7, "iterators");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // CF
          return CF;
        case 2: // CQ
          return CQ;
        case 3: // CV
          return CV;
        case 4: // TS
          return TS;
        case 5: // HAS_TIMESTAMP
          return HAS_TIMESTAMP;
        case 6: // VAL
          return VAL;
        case 7: // ITERATORS
          return ITERATORS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    @Override
    public short getThriftFieldId() {
      return _thriftId;
    }

    @Override
    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __TS_ISSET_ID = 0;
  private static final int __HASTIMESTAMP_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CF, new org.apache.thrift.meta_data.FieldMetaData("cf", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.CQ, new org.apache.thrift.meta_data.FieldMetaData("cq", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.CV, new org.apache.thrift.meta_data.FieldMetaData("cv", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.TS, new org.apache.thrift.meta_data.FieldMetaData("ts", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.HAS_TIMESTAMP, new org.apache.thrift.meta_data.FieldMetaData("hasTimestamp", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.VAL, new org.apache.thrift.meta_data.FieldMetaData("val", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.ITERATORS, new org.apache.thrift.meta_data.FieldMetaData("iterators", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TCondition.class, metaDataMap);
  }

  public TCondition() {
  }

  public TCondition(
    java.nio.ByteBuffer cf,
    java.nio.ByteBuffer cq,
    java.nio.ByteBuffer cv,
    long ts,
    boolean hasTimestamp,
    java.nio.ByteBuffer val,
    java.nio.ByteBuffer iterators)
  {
    this();
    this.cf = org.apache.thrift.TBaseHelper.copyBinary(cf);
    this.cq = org.apache.thrift.TBaseHelper.copyBinary(cq);
    this.cv = org.apache.thrift.TBaseHelper.copyBinary(cv);
    this.ts = ts;
    setTsIsSet(true);
    this.hasTimestamp = hasTimestamp;
    setHasTimestampIsSet(true);
    this.val = org.apache.thrift.TBaseHelper.copyBinary(val);
    this.iterators = org.apache.thrift.TBaseHelper.copyBinary(iterators);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TCondition(TCondition other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetCf()) {
      this.cf = org.apache.thrift.TBaseHelper.copyBinary(other.cf);
    }
    if (other.isSetCq()) {
      this.cq = org.apache.thrift.TBaseHelper.copyBinary(other.cq);
    }
    if (other.isSetCv()) {
      this.cv = org.apache.thrift.TBaseHelper.copyBinary(other.cv);
    }
    this.ts = other.ts;
    this.hasTimestamp = other.hasTimestamp;
    if (other.isSetVal()) {
      this.val = org.apache.thrift.TBaseHelper.copyBinary(other.val);
    }
    if (other.isSetIterators()) {
      this.iterators = org.apache.thrift.TBaseHelper.copyBinary(other.iterators);
    }
  }

  @Override
  public TCondition deepCopy() {
    return new TCondition(this);
  }

  @Override
  public void clear() {
    this.cf = null;
    this.cq = null;
    this.cv = null;
    setTsIsSet(false);
    this.ts = 0;
    setHasTimestampIsSet(false);
    this.hasTimestamp = false;
    this.val = null;
    this.iterators = null;
  }

  public byte[] getCf() {
    setCf(org.apache.thrift.TBaseHelper.rightSize(cf));
    return cf == null ? null : cf.array();
  }

  public java.nio.ByteBuffer bufferForCf() {
    return org.apache.thrift.TBaseHelper.copyBinary(cf);
  }

  public TCondition setCf(byte[] cf) {
    this.cf = cf == null ? (java.nio.ByteBuffer)null   : java.nio.ByteBuffer.wrap(cf.clone());
    return this;
  }

  public TCondition setCf(@org.apache.thrift.annotation.Nullable java.nio.ByteBuffer cf) {
    this.cf = org.apache.thrift.TBaseHelper.copyBinary(cf);
    return this;
  }

  public void unsetCf() {
    this.cf = null;
  }

  /** Returns true if field cf is set (has been assigned a value) and false otherwise */
  public boolean isSetCf() {
    return this.cf != null;
  }

  public void setCfIsSet(boolean value) {
    if (!value) {
      this.cf = null;
    }
  }

  public byte[] getCq() {
    setCq(org.apache.thrift.TBaseHelper.rightSize(cq));
    return cq == null ? null : cq.array();
  }

  public java.nio.ByteBuffer bufferForCq() {
    return org.apache.thrift.TBaseHelper.copyBinary(cq);
  }

  public TCondition setCq(byte[] cq) {
    this.cq = cq == null ? (java.nio.ByteBuffer)null   : java.nio.ByteBuffer.wrap(cq.clone());
    return this;
  }

  public TCondition setCq(@org.apache.thrift.annotation.Nullable java.nio.ByteBuffer cq) {
    this.cq = org.apache.thrift.TBaseHelper.copyBinary(cq);
    return this;
  }

  public void unsetCq() {
    this.cq = null;
  }

  /** Returns true if field cq is set (has been assigned a value) and false otherwise */
  public boolean isSetCq() {
    return this.cq != null;
  }

  public void setCqIsSet(boolean value) {
    if (!value) {
      this.cq = null;
    }
  }

  public byte[] getCv() {
    setCv(org.apache.thrift.TBaseHelper.rightSize(cv));
    return cv == null ? null : cv.array();
  }

  public java.nio.ByteBuffer bufferForCv() {
    return org.apache.thrift.TBaseHelper.copyBinary(cv);
  }

  public TCondition setCv(byte[] cv) {
    this.cv = cv == null ? (java.nio.ByteBuffer)null   : java.nio.ByteBuffer.wrap(cv.clone());
    return this;
  }

  public TCondition setCv(@org.apache.thrift.annotation.Nullable java.nio.ByteBuffer cv) {
    this.cv = org.apache.thrift.TBaseHelper.copyBinary(cv);
    return this;
  }

  public void unsetCv() {
    this.cv = null;
  }

  /** Returns true if field cv is set (has been assigned a value) and false otherwise */
  public boolean isSetCv() {
    return this.cv != null;
  }

  public void setCvIsSet(boolean value) {
    if (!value) {
      this.cv = null;
    }
  }

  public long getTs() {
    return this.ts;
  }

  public TCondition setTs(long ts) {
    this.ts = ts;
    setTsIsSet(true);
    return this;
  }

  public void unsetTs() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TS_ISSET_ID);
  }

  /** Returns true if field ts is set (has been assigned a value) and false otherwise */
  public boolean isSetTs() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TS_ISSET_ID);
  }

  public void setTsIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TS_ISSET_ID, value);
  }

  public boolean isHasTimestamp() {
    return this.hasTimestamp;
  }

  public TCondition setHasTimestamp(boolean hasTimestamp) {
    this.hasTimestamp = hasTimestamp;
    setHasTimestampIsSet(true);
    return this;
  }

  public void unsetHasTimestamp() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __HASTIMESTAMP_ISSET_ID);
  }

  /** Returns true if field hasTimestamp is set (has been assigned a value) and false otherwise */
  public boolean isSetHasTimestamp() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __HASTIMESTAMP_ISSET_ID);
  }

  public void setHasTimestampIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __HASTIMESTAMP_ISSET_ID, value);
  }

  public byte[] getVal() {
    setVal(org.apache.thrift.TBaseHelper.rightSize(val));
    return val == null ? null : val.array();
  }

  public java.nio.ByteBuffer bufferForVal() {
    return org.apache.thrift.TBaseHelper.copyBinary(val);
  }

  public TCondition setVal(byte[] val) {
    this.val = val == null ? (java.nio.ByteBuffer)null   : java.nio.ByteBuffer.wrap(val.clone());
    return this;
  }

  public TCondition setVal(@org.apache.thrift.annotation.Nullable java.nio.ByteBuffer val) {
    this.val = org.apache.thrift.TBaseHelper.copyBinary(val);
    return this;
  }

  public void unsetVal() {
    this.val = null;
  }

  /** Returns true if field val is set (has been assigned a value) and false otherwise */
  public boolean isSetVal() {
    return this.val != null;
  }

  public void setValIsSet(boolean value) {
    if (!value) {
      this.val = null;
    }
  }

  public byte[] getIterators() {
    setIterators(org.apache.thrift.TBaseHelper.rightSize(iterators));
    return iterators == null ? null : iterators.array();
  }

  public java.nio.ByteBuffer bufferForIterators() {
    return org.apache.thrift.TBaseHelper.copyBinary(iterators);
  }

  public TCondition setIterators(byte[] iterators) {
    this.iterators = iterators == null ? (java.nio.ByteBuffer)null   : java.nio.ByteBuffer.wrap(iterators.clone());
    return this;
  }

  public TCondition setIterators(@org.apache.thrift.annotation.Nullable java.nio.ByteBuffer iterators) {
    this.iterators = org.apache.thrift.TBaseHelper.copyBinary(iterators);
    return this;
  }

  public void unsetIterators() {
    this.iterators = null;
  }

  /** Returns true if field iterators is set (has been assigned a value) and false otherwise */
  public boolean isSetIterators() {
    return this.iterators != null;
  }

  public void setIteratorsIsSet(boolean value) {
    if (!value) {
      this.iterators = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case CF:
      if (value == null) {
        unsetCf();
      } else {
        if (value instanceof byte[]) {
          setCf((byte[])value);
        } else {
          setCf((java.nio.ByteBuffer)value);
        }
      }
      break;

    case CQ:
      if (value == null) {
        unsetCq();
      } else {
        if (value instanceof byte[]) {
          setCq((byte[])value);
        } else {
          setCq((java.nio.ByteBuffer)value);
        }
      }
      break;

    case CV:
      if (value == null) {
        unsetCv();
      } else {
        if (value instanceof byte[]) {
          setCv((byte[])value);
        } else {
          setCv((java.nio.ByteBuffer)value);
        }
      }
      break;

    case TS:
      if (value == null) {
        unsetTs();
      } else {
        setTs((java.lang.Long)value);
      }
      break;

    case HAS_TIMESTAMP:
      if (value == null) {
        unsetHasTimestamp();
      } else {
        setHasTimestamp((java.lang.Boolean)value);
      }
      break;

    case VAL:
      if (value == null) {
        unsetVal();
      } else {
        if (value instanceof byte[]) {
          setVal((byte[])value);
        } else {
          setVal((java.nio.ByteBuffer)value);
        }
      }
      break;

    case ITERATORS:
      if (value == null) {
        unsetIterators();
      } else {
        if (value instanceof byte[]) {
          setIterators((byte[])value);
        } else {
          setIterators((java.nio.ByteBuffer)value);
        }
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case CF:
      return getCf();

    case CQ:
      return getCq();

    case CV:
      return getCv();

    case TS:
      return getTs();

    case HAS_TIMESTAMP:
      return isHasTimestamp();

    case VAL:
      return getVal();

    case ITERATORS:
      return getIterators();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  @Override
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case CF:
      return isSetCf();
    case CQ:
      return isSetCq();
    case CV:
      return isSetCv();
    case TS:
      return isSetTs();
    case HAS_TIMESTAMP:
      return isSetHasTimestamp();
    case VAL:
      return isSetVal();
    case ITERATORS:
      return isSetIterators();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TCondition)
      return this.equals((TCondition)that);
    return false;
  }

  public boolean equals(TCondition that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_cf = true && this.isSetCf();
    boolean that_present_cf = true && that.isSetCf();
    if (this_present_cf || that_present_cf) {
      if (!(this_present_cf && that_present_cf))
        return false;
      if (!this.cf.equals(that.cf))
        return false;
    }

    boolean this_present_cq = true && this.isSetCq();
    boolean that_present_cq = true && that.isSetCq();
    if (this_present_cq || that_present_cq) {
      if (!(this_present_cq && that_present_cq))
        return false;
      if (!this.cq.equals(that.cq))
        return false;
    }

    boolean this_present_cv = true && this.isSetCv();
    boolean that_present_cv = true && that.isSetCv();
    if (this_present_cv || that_present_cv) {
      if (!(this_present_cv && that_present_cv))
        return false;
      if (!this.cv.equals(that.cv))
        return false;
    }

    boolean this_present_ts = true;
    boolean that_present_ts = true;
    if (this_present_ts || that_present_ts) {
      if (!(this_present_ts && that_present_ts))
        return false;
      if (this.ts != that.ts)
        return false;
    }

    boolean this_present_hasTimestamp = true;
    boolean that_present_hasTimestamp = true;
    if (this_present_hasTimestamp || that_present_hasTimestamp) {
      if (!(this_present_hasTimestamp && that_present_hasTimestamp))
        return false;
      if (this.hasTimestamp != that.hasTimestamp)
        return false;
    }

    boolean this_present_val = true && this.isSetVal();
    boolean that_present_val = true && that.isSetVal();
    if (this_present_val || that_present_val) {
      if (!(this_present_val && that_present_val))
        return false;
      if (!this.val.equals(that.val))
        return false;
    }

    boolean this_present_iterators = true && this.isSetIterators();
    boolean that_present_iterators = true && that.isSetIterators();
    if (this_present_iterators || that_present_iterators) {
      if (!(this_present_iterators && that_present_iterators))
        return false;
      if (!this.iterators.equals(that.iterators))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetCf()) ? 131071 : 524287);
    if (isSetCf())
      hashCode = hashCode * 8191 + cf.hashCode();

    hashCode = hashCode * 8191 + ((isSetCq()) ? 131071 : 524287);
    if (isSetCq())
      hashCode = hashCode * 8191 + cq.hashCode();

    hashCode = hashCode * 8191 + ((isSetCv()) ? 131071 : 524287);
    if (isSetCv())
      hashCode = hashCode * 8191 + cv.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(ts);

    hashCode = hashCode * 8191 + ((hasTimestamp) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetVal()) ? 131071 : 524287);
    if (isSetVal())
      hashCode = hashCode * 8191 + val.hashCode();

    hashCode = hashCode * 8191 + ((isSetIterators()) ? 131071 : 524287);
    if (isSetIterators())
      hashCode = hashCode * 8191 + iterators.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TCondition other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetCf(), other.isSetCf());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCf()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cf, other.cf);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetCq(), other.isSetCq());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCq()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cq, other.cq);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetCv(), other.isSetCv());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCv()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cv, other.cv);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetTs(), other.isSetTs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ts, other.ts);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetHasTimestamp(), other.isSetHasTimestamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHasTimestamp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hasTimestamp, other.hasTimestamp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetVal(), other.isSetVal());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVal()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.val, other.val);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetIterators(), other.isSetIterators());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIterators()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.iterators, other.iterators);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  @Override
  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  @Override
  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TCondition(");
    boolean first = true;

    sb.append("cf:");
    if (this.cf == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.cf, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("cq:");
    if (this.cq == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.cq, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("cv:");
    if (this.cv == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.cv, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("ts:");
    sb.append(this.ts);
    first = false;
    if (!first) sb.append(", ");
    sb.append("hasTimestamp:");
    sb.append(this.hasTimestamp);
    first = false;
    if (!first) sb.append(", ");
    sb.append("val:");
    if (this.val == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.val, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("iterators:");
    if (this.iterators == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.iterators, sb);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TConditionStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TConditionStandardScheme getScheme() {
      return new TConditionStandardScheme();
    }
  }

  private static class TConditionStandardScheme extends org.apache.thrift.scheme.StandardScheme<TCondition> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TCondition struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CF
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.cf = iprot.readBinary();
              struct.setCfIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CQ
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.cq = iprot.readBinary();
              struct.setCqIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CV
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.cv = iprot.readBinary();
              struct.setCvIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TS
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.ts = iprot.readI64();
              struct.setTsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // HAS_TIMESTAMP
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.hasTimestamp = iprot.readBool();
              struct.setHasTimestampIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // VAL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.val = iprot.readBinary();
              struct.setValIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // ITERATORS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.iterators = iprot.readBinary();
              struct.setIteratorsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    @Override
    public void write(org.apache.thrift.protocol.TProtocol oprot, TCondition struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.cf != null) {
        oprot.writeFieldBegin(CF_FIELD_DESC);
        oprot.writeBinary(struct.cf);
        oprot.writeFieldEnd();
      }
      if (struct.cq != null) {
        oprot.writeFieldBegin(CQ_FIELD_DESC);
        oprot.writeBinary(struct.cq);
        oprot.writeFieldEnd();
      }
      if (struct.cv != null) {
        oprot.writeFieldBegin(CV_FIELD_DESC);
        oprot.writeBinary(struct.cv);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(TS_FIELD_DESC);
      oprot.writeI64(struct.ts);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(HAS_TIMESTAMP_FIELD_DESC);
      oprot.writeBool(struct.hasTimestamp);
      oprot.writeFieldEnd();
      if (struct.val != null) {
        oprot.writeFieldBegin(VAL_FIELD_DESC);
        oprot.writeBinary(struct.val);
        oprot.writeFieldEnd();
      }
      if (struct.iterators != null) {
        oprot.writeFieldBegin(ITERATORS_FIELD_DESC);
        oprot.writeBinary(struct.iterators);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TConditionTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TConditionTupleScheme getScheme() {
      return new TConditionTupleScheme();
    }
  }

  private static class TConditionTupleScheme extends org.apache.thrift.scheme.TupleScheme<TCondition> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TCondition struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetCf()) {
        optionals.set(0);
      }
      if (struct.isSetCq()) {
        optionals.set(1);
      }
      if (struct.isSetCv()) {
        optionals.set(2);
      }
      if (struct.isSetTs()) {
        optionals.set(3);
      }
      if (struct.isSetHasTimestamp()) {
        optionals.set(4);
      }
      if (struct.isSetVal()) {
        optionals.set(5);
      }
      if (struct.isSetIterators()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetCf()) {
        oprot.writeBinary(struct.cf);
      }
      if (struct.isSetCq()) {
        oprot.writeBinary(struct.cq);
      }
      if (struct.isSetCv()) {
        oprot.writeBinary(struct.cv);
      }
      if (struct.isSetTs()) {
        oprot.writeI64(struct.ts);
      }
      if (struct.isSetHasTimestamp()) {
        oprot.writeBool(struct.hasTimestamp);
      }
      if (struct.isSetVal()) {
        oprot.writeBinary(struct.val);
      }
      if (struct.isSetIterators()) {
        oprot.writeBinary(struct.iterators);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TCondition struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.cf = iprot.readBinary();
        struct.setCfIsSet(true);
      }
      if (incoming.get(1)) {
        struct.cq = iprot.readBinary();
        struct.setCqIsSet(true);
      }
      if (incoming.get(2)) {
        struct.cv = iprot.readBinary();
        struct.setCvIsSet(true);
      }
      if (incoming.get(3)) {
        struct.ts = iprot.readI64();
        struct.setTsIsSet(true);
      }
      if (incoming.get(4)) {
        struct.hasTimestamp = iprot.readBool();
        struct.setHasTimestampIsSet(true);
      }
      if (incoming.get(5)) {
        struct.val = iprot.readBinary();
        struct.setValIsSet(true);
      }
      if (incoming.get(6)) {
        struct.iterators = iprot.readBinary();
        struct.setIteratorsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
  private static void unusedMethod() {}
}

