/*
 * Copyright (c) 2015-2020, Oracle and/or its affiliates. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Provides abstract classes for interfacing with XGBoost abstracting away all the {@link org.tribuo.Output}
 * dependent parts.
 * <p>
 * Note: XGBoost requires a native library, on macOS this library requires libomp (which can be installed via homebrew),
 * on Windows this native library must be compiled into a jar as it's not contained in the official XGBoost binary
 * on Maven Central.
 */
package org.tribuo.common.xgboost;