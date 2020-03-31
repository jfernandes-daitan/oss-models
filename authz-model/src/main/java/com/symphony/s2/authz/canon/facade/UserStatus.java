/**
 * Copyright 2020 Symphony Communication Services, LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *----------------------------------------------------------------------------------------------------
 * Proforma generated from
 *		Template groupId		 org.symphonyoss.s2.canon
 *           artifactId canon-template-java
 *		Template name		   proforma/java/Object/_.java.ftl
 *		Template version	   1.0
 *  At                  2020-03-28 17:43:30 GMT
 *----------------------------------------------------------------------------------------------------
 */

package com.symphony.s2.authz.canon.facade;

import java.time.Instant;

import javax.annotation.concurrent.Immutable;

import org.symphonyoss.s2.common.immutable.ImmutableByteArray;
import org.symphonyoss.s2.fugue.kv.IKvPartitionKey;
import org.symphonyoss.s2.fugue.kv.IKvPartitionSortKeyProvider;
import org.symphonyoss.s2.fugue.kv.IKvSortKey;
import org.symphonyoss.s2.fugue.kv.KvPartitionKey;
import org.symphonyoss.s2.fugue.kv.KvPartitionSortKeyProvider;
import org.symphonyoss.s2.fugue.kv.KvSortKey;
import org.symphonyoss.s2.fugue.store.IFuguePodId;
import org.symphonyoss.s2.common.dom.json.ImmutableJsonObject;
import org.symphonyoss.s2.common.dom.json.MutableJsonObject;
import org.symphonyoss.s2.common.hash.Hash;
import org.symphonyoss.s2.canon.runtime.IEntity;
import org.symphonyoss.s2.canon.runtime.IModelRegistry;


import com.symphony.s2.authz.canon.UserStatusEntity;
import com.symphony.s2.authz.canon.IUserStatusEntity;
import com.symphony.oss.models.core.canon.facade.PodAndUserId;
import com.symphony.s2.authz.canon.AuthzModel;

/**
 * Facade for Object ObjectSchema(UserStatus)
 *
 * The status of a user account.
 * Generated from ObjectSchema(UserStatus) at #/components/schemas/UserStatus
 */
@Immutable
@SuppressWarnings("unused")
public class UserStatus extends UserStatusEntity implements IUserStatus
{
  /**
   * Constructor from builder.
   * 
   * @param builder A mutable builder containing all values.
   */
  public UserStatus(AbstractUserStatusBuilder<?,?> builder)
  {
    super(builder);
  }
  
  /**
   * Constructor from serialised form.
   * 
   * @param jsonObject An immutable JSON object containing the serialized form of the object.
   * @param modelRegistry A model registry to use to deserialize any nested objects.
   */
  public UserStatus(ImmutableJsonObject jsonObject, IModelRegistry modelRegistry)
  {
    super(jsonObject, modelRegistry);
  }
  
  /**
   * Constructor from mutable JSON object.
   * 
   * @param mutableJsonObject A mutable JSON object containing the serialized form of the object.
   * @param modelRegistry A model registry to use to deserialize any nested objects.
   */
  public UserStatus(MutableJsonObject mutableJsonObject, IModelRegistry modelRegistry)
  {
    super(mutableJsonObject, modelRegistry);
  }
   
  /**
   * Copy constructor.
   * 
   * @param other Another instance from which all attributes are to be copied.
   */
  public UserStatus(IUserStatus other)
  {
    super(other);
  }
  
  @Override
  public IKvPartitionKey getPartitionKey()
  {
    return getPartitionKeyFor(getUserId());
  }
  
  /**
   * Get the partition key for Entitlement object for the given hash.
   * 
   * @param userId The ID of the user to whom this status relates.
   * 
   * @return The partition key for Entitlement object for the given hash.
   */
  public static KvPartitionKey getPartitionKeyFor(PodAndUserId userId)
  {
    return new KvPartitionKey("US#" + userId);
  }
  
  /**
   * Get the partition key for Entitlement object for the given hash.
   * 
   * @param userId The ID of the user to whom this status relates.
   * 
   * @return The partition key for Entitlement object for the given hash.
   */
  public static KvPartitionSortKeyProvider getPartitionSortKeyFor(PodAndUserId userId)
  {
    return new KvPartitionSortKeyProvider(getPartitionKeyFor(userId), new KvSortKey("US#"));
  }

  @Override
  public IKvSortKey getSortKey()
  {
    return new KvSortKey("US#");
  }

  @Override
  public String getJson()
  {
    return super.toString();
  }

  @Override
  public String getType()
  {
    return getCanonType();
  }

  @Override
  public Instant getPurgeDate()
  {
    return null;
  }

  @Override
  public IFuguePodId getPodId()
  {
    return getUserId().getPodId();
  }
}
/*----------------------------------------------------------------------------------------------------
 * End of template proforma/java/Object/_.java.ftl
 * End of code generation
 *------------------------------------------------------------------------------------------------- */