/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package model.base;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author shadow
 */
public class Maze implements Cloneable {
    private ArrayList<Room> rooms;

    public Maze() {
        rooms = new ArrayList<>();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Room room = new Room(1);
        Maze maze = new Maze();
        maze.AddRoom(room);
        System.err.println(maze.rooms);
        System.err.println(maze);
        System.err.println(maze.getRoomCount());

        Maze maze2 = maze.clone();
        maze2.AddRoom(room.clone());
        System.err.println(maze.rooms);
        System.err.println(maze2);
        System.err.println(maze2.getRoomCount());

        System.err.println(maze.rooms);
        System.err.println(maze.getRoomCount());
    }

    public void AddRoom(Room room) {
        if (room == null) {
            throw new RuntimeException("The room is null.");
        }

        rooms.add(room);

    }

    public int getRoomCount() {
        return this.rooms.size();
    }

    @Override
    public Maze clone() throws CloneNotSupportedException {
        Maze cloneMaze = (Maze) super.clone();
        clone(cloneMaze);
        return cloneMaze;
    }

    private void clone(Maze maze) throws CloneNotSupportedException {
        maze.rooms = new ArrayList<>();
        for (int i = 0; i < this.rooms.size(); i++) {
            maze.rooms.add(this.rooms.get(i).clone());
        }
    }

    public Room getRoom(final int number) {
        for (int i = 0; i < rooms.size(); i++) {
            if (rooms.get(i).getRoomNumber() == number) {
                return rooms.get(i);
            }
        }
        return null;
    }

    public Iterator<Room> iterator() {
        return rooms.iterator();
    }
}
