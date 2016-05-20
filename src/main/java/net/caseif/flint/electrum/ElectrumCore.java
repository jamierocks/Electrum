/*
 * This file is part of Electrum, licensed under the MIT License (MIT).
 *
 * Copyright (c) 2016, Jamie Mansfield <https://www.jamierocks.uk/>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package net.caseif.flint.electrum;

import net.caseif.flint.FlintCore;
import net.caseif.flint.common.CommonCore;
import net.caseif.flint.common.component.CommonComponent;
import net.caseif.flint.minigame.Minigame;

/**
 * The Sponge implementation of {@link FlintCore}.
 *
 * @author Jamie Mansfield
 */
public class ElectrumCore extends CommonCore {

    @Override
    protected void logInfo0(String message) {
        ElectrumPlugin.getInstance().getLogger().info(message);
    }

    @Override
    protected void logWarning0(String message) {
        ElectrumPlugin.getInstance().getLogger().warn(message);
    }

    @Override
    protected void logSevere0(String message) {
        ElectrumPlugin.getInstance().getLogger().error(message);
    }

    @Override
    protected void logVerbose0(String message) {
        this.logInfo0(message);
    }

    @Override
    protected void orphan0(CommonComponent<?> component) {

    }

    @Override
    protected String getImplementationName0() {
        return "Electrum";
    }

    @Override
    protected Minigame registerPlugin0(String pluginId) throws IllegalStateException {
        return null;
    }
}
