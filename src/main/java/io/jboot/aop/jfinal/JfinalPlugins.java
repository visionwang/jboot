/**
 * Copyright (c) 2015-2017, Michael Yang 杨福海 (fuhai999@gmail.com).
 * <p>
 * Licensed under the GNU Lesser General Public License (LGPL) ,Version 3.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.gnu.org/licenses/lgpl-3.0.txt
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.jboot.aop.jfinal;

import com.jfinal.config.Plugins;
import com.jfinal.plugin.IPlugin;
import io.jboot.Jboot;

/**
 * Jfinal Plugins 的代理类，方便为Plugin插件的自动注入功能
 */
public class JfinalPlugins {

    private final Plugins plugins;

    public JfinalPlugins(Plugins plugins) {
        this.plugins = plugins;
    }

    public JfinalPlugins add(IPlugin plugin) {
        Jboot.injectMembers(plugin);
        plugins.add(plugin);
        return this;
    }
}
