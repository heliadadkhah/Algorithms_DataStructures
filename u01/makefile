JAVAC = javac
JAVA = java

# Define the source files
SOURCES = Main.java\
		Quicksort.java\
		Insertionsort.java\
		Test0.java\
		Test1.java\
		Test2.java\
		Test3.java\

# Define the main class
MAIN_CLASS = Main

# Define the build directory
BUILD_DIR = build

# Specify dependencies for the .class files
CLASSES = $(SOURCES:.java=.class)

all: $(CLASSES)

%.class: %.java
	$(JAVAC) $<

run: all
	$(JAVA) $(MAIN_CLASS)

clean:
	rm $(CLASSES)

.PHONY: all run clean