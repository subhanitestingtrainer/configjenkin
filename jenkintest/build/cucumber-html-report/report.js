$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("dragAndDrop.feature");
formatter.feature({
  "id": "drag-and-drop-feature",
  "tags": [
    {
      "name": "@dandd",
      "line": 1
    }
  ],
  "description": "",
  "name": "Drag and Drop feature",
  "keyword": "Feature",
  "line": 2
});
formatter.scenario({
  "id": "drag-and-drop-feature;drag-the-drop-the-elements",
  "description": "",
  "name": "Drag the drop the elements",
  "keyword": "Scenario",
  "line": 4,
  "type": "scenario"
});
formatter.step({
  "name": "open the interaction groups page",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "i drag and drop the items",
  "keyword": "When ",
  "line": 6
});
formatter.step({
  "name": "items are dropped",
  "keyword": "Then ",
  "line": 7
});
formatter.match({
  "location": "JenkinSteps.open_the_interaction_groups_page()"
});
formatter.result({
  "duration": 19715427179,
  "status": "passed"
});
formatter.match({
  "location": "JenkinSteps.i_drag_and_drop_the_items()"
});
formatter.result({
  "duration": 1291247412,
  "status": "passed"
});
formatter.match({
  "location": "JenkinSteps.items_are_dropped()"
});
formatter.result({
  "duration": 37219,
  "status": "passed"
});
});