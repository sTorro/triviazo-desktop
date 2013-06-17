/*
 * This file is part of Triviazo project.
 * 
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the
 * Free Software Foundation; either version 3 of the License, or (at your
 * option) any later version. This program is distributed in the hope that
 * it will be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with triviazo-project.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * Copyright 2013 Sergio Torró.
 */

package com.torrosoft.triviazo;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Files.FileType;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.torrosoft.triviazo.core.data.DatabaseDesktop;

/**
 * Main entry point for the desktop game.
 * 
 * @author Sergio Torró
 * @since 01/05/2013
 * @version 0.1
 */
public class TriviazoDesktopLauncher {
    public static void main(final String[] args) {
        final ApplicationListener listener = new TriviazoGame(new DatabaseDesktop());
        final LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();

        // java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        // java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;

        cfg.title = "Triviazo";
        cfg.useGL20 = true;
        // cfg.fullscreen = true;
        // cfg.resizable = false;
        cfg.width = 800; // 1280 1152 800
        cfg.height = 480; // 720 648 480
        cfg.addIcon("icon.png", FileType.Internal);

        new LwjglApplication(listener, cfg);
    }
}
