/*
 * Copyright (C) 2014 Qiujuer <qiujuer@live.cn>
 * WebSite http://www.qiujuer.net
 * Created 04/16/2015
 * Changed 04/19/2015
 * Version 1.0.0
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.qiujuer.blink.kit;

import java.io.File;

/**
 * Blink Files Resource
 */
public interface Resource {
    /**
     * Create a file from resource.
     *
     * @return New file path
     */
    File create(long id);

    /**
     * Empties the resource by oneself
     */
    void clear();

    /**
     * Empties the resource by the path
     */
    void clearAll();

    /**
     * Get the Mark
     *
     * @return Receive Mark
     */
    String getMark();
}
