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
 *		Template name		   proforma/java/Object/I_.java.ftl
 *		Template version	   1.0
 *  At                  2020-03-28 17:43:30 GMT
 *----------------------------------------------------------------------------------------------------
 */

package com.symphony.s2.authz.canon.facade;

import javax.annotation.concurrent.Immutable;

import com.symphony.oss.fugue.kv.IKvItem;
import com.symphony.oss.models.core.canon.facade.ISystemObject;
import com.symphony.s2.authz.canon.IUserStatusEntity;

/**
 * Facade for Object ObjectSchema(UserStatus)
 *
 * The status of a user account.
 * Generated from ObjectSchema(UserStatus) at #/components/schemas/UserStatus
 */
@Immutable
public interface IUserStatus
  extends ISystemObject, IUserStatusEntity, IKvItem
{
}
/*----------------------------------------------------------------------------------------------------
 * End of template proforma/java/Object/I_.java.ftl
 * End of code generation
 *------------------------------------------------------------------------------------------------- */