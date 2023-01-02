# NOTICE FILE IS WIP

# Java Class Changes
Every class that was in src/main/java/com/numbah90 has been deleted, moved, or recreated to
src/main/java/com/ohmyc.

## Specific Changes:

 - BetterSugarCane.java is not the original file, but rather a recreation that should do the same things
  (Add the items/blocks to the game) via the Fabric API rather than Forge.
 - The ItemmodFood, and ItemsugarCaneRod java files have been removed, as they don't really provide enough
  use over creating a new instance of a regular item via Fabric to justify keeping around.
 - The help and creativetab folders have been removed, as their functionality can be moved into other files
