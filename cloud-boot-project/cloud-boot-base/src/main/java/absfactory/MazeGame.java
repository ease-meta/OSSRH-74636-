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
package absfactory;

import builder.MazeBuilder;
import builder.StandardMazeBuilder;
import model.base.Direction;
import model.base.Door;
import model.base.Maze;
import model.base.Room;
import model.base.Wall;
import model.enchanted.EnchantedMazeFactory;

/**
 * The main test class.
 *
 * @author shadow
 */
public class MazeGame {
	public static void main(String[] args) {
		// MazeGame game = new MazeGame();
		// MazeFactory factory = new MazeFactory();
		// Maze amaze = game.CreateMaze(factory);
		// System.err.println(amaze.getRoomCount());

		MazeGame game = new MazeGame();
		//		EnchantedMazeFactory factory = new EnchantedMazeFactory();
		//		Maze amaze = game.CreateMaze(factory);

		MazeFactory factory = new EnchantedMazeFactory();
		MazeBuilder builder = new StandardMazeBuilder(factory);
		Maze amaze = game.CreateMaze(builder);

		System.err.println(amaze.getRoomCount());
		Room room = amaze.getRoom(1);
		room.Enter();
		// EnchantedRoom room = (EnchantedRoom) amaze.getRoom(1);
		// System.err.println(room.getSpell().getSpell());

	}

	//Builder
	public Maze CreateMaze(MazeBuilder builder) {
		builder.Buildmaze();

		builder.BuildRoom(1);
		builder.BuildRoom(2);
		builder.BuildDoor(1, 2);

		return builder.GetMaze();
	}

	//Normal
	public Maze CreateMaze() {
		Maze aMaze = new Maze();

		Room room1 = new Room(1);
		Room room2 = new Room(2);
		Door theDoor = new Door(room1, room2);
		aMaze.AddRoom(room1);
		aMaze.AddRoom(room2);

		room1.SetSide(Direction.North, new Wall());
		room1.SetSide(Direction.East, theDoor);
		room1.SetSide(Direction.South, new Wall());
		room1.SetSide(Direction.West, new Wall());

		room2.SetSide(Direction.North, new Wall());
		room2.SetSide(Direction.East, new Wall());
		room2.SetSide(Direction.South, new Wall());
		room2.SetSide(Direction.West, theDoor);

		return aMaze;
	}

	//Abstract Factory
	public Maze CreateMaze(MazeFactory factory) {

		Maze maze = factory.MakeMaze();
		Room room1 = factory.MakeRoom(1);
		Room room2 = factory.MakeRoom(2);
		Door door = factory.MakeDoor(room1, room2);

		maze.AddRoom(room1);
		maze.AddRoom(room2);

		room1.SetSide(Direction.North, factory.MakeWall());
		room1.SetSide(Direction.East, door);
		room1.SetSide(Direction.South, factory.MakeWall());
		room1.SetSide(Direction.West, factory.MakeWall());

		room2.SetSide(Direction.North, factory.MakeWall());
		room2.SetSide(Direction.East, factory.MakeWall());
		room2.SetSide(Direction.South, factory.MakeWall());
		room2.SetSide(Direction.West, door);

		return maze;
	}
}
