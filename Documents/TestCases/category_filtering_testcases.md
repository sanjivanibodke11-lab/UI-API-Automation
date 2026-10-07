# Manual Test Cases: Filtering by Category

- **Source:** `.claude/AcceptanceCriteria/category_filtering_criteria.xlsx` (AC10 to AC13)
- **Application:** https://practicesoftwaretesting.com/ (Toolshop v5.0)
- **Skill:** `.claude/TestCaseGenerator-skill/SKILL.md`
- **Explored with:** Playwright MCP server, 2026-10-04

## Acceptance Criteria Summary

| AC ID | Title | Given | When | Then / And |
|---|---|---|---|---|
| AC10 | Category filter is displayed | I am on the product overview page | n/a | A list of category checkboxes is displayed in the sidebar |
| AC11 | Hierarchical categories | The category filter is displayed | n/a | Categories are shown as a tree of parent and child categories |
| AC12 | Selecting a parent category | A parent category has child categories | I check the parent checkbox | All child checkboxes are also checked, and the product grid shows products from all of those categories |
| AC13 | Deselecting child categories | All child categories of a parent are checked | I uncheck every child checkbox | The parent checkbox is also unchecked |

## UI Observed During Exploration

The left sidebar of the home page has the headings **Sort**, **Price Range**, **Search** and **Filters**. Under Filters there are three groups: **By category:**, **By brand:** and **Sustainability:**.

The **By category:** group contains this tree:

| Parent category | Child categories |
|---|---|
| Hand Tools | Hammer, Hand Saw, Wrench, Screwdriver, Pliers, Chisels, Measures |
| Power Tools | Grinder, Sander, Saw, Drill |
| Other | Tool Belts, Storage Solutions, Workbench, Safety Gear, Fasteners |

What the site did when I tried it:

- Checking **Hand Tools** also checked all 7 of its children. The grid showed Pliers and Hammer products and had pagination.
- Checking **Power Tools** also checked Grinder, Sander, Saw and Drill. The grid showed Sheet Sander, Belt Sander, Circular Saw, Cordless Drill 24V and Cordless Drill 12V.
- Unchecking the children of Hand Tools one at a time kept **Hand Tools checked** until the last child was unchecked. Only then did the parent become unchecked. It never showed a partial (indeterminate) state.
- Checking only **Hammer** left Hand Tools unchecked. The grid showed only the 7 hammer products.
- Checking every child of Power Tools by hand caused **Power Tools** to become checked automatically.
- Checking **Workbench** showed the message "There are no products found."
- Unchecking a parent cleared all of its children, and the grid went back to the full, unfiltered list.

---

## 1. Smoke Tests

### TC_SMOKE_001: Category filter loads on the home page (AC10)
- **Test Type:** Smoke / Positive
- **Objective:** Confirm that the category filter appears and works on the product overview page.
- **Prerequisites:** Browser with internet access. No login needed.
- **Steps:**
  1. Open https://practicesoftwaretesting.com/.
  2. Wait for the product cards to appear.
  3. In the left sidebar, find the **Filters** heading and the **By category:** sub-heading below it.
- **Expected Result:** The **By category:** section shows a list of checkboxes. Each checkbox has a visible label. All checkboxes are unchecked when the page loads.

### TC_SMOKE_002: Checking a parent category filters the grid (AC12)
- **Test Type:** Smoke / Positive
- **Objective:** Confirm that the main filtering path works from start to finish.
- **Prerequisites:** TC_SMOKE_001 passed.
- **Steps:**
  1. Under **By category:**, click the checkbox labeled **Hand Tools**.
  2. Wait for the product grid to refresh.
- **Expected Result:** **Hand Tools** and all of its children are checked. The grid shows only hand-tool products, such as "Combination Pliers" and "Claw Hammer". No power tools appear.

---

## 2. Sanity Tests

### TC_SAN_001: Selecting and clearing a parent category (AC12, AC13)
- **Test Type:** Sanity
- **Objective:** Quickly check that a parent category can be selected and cleared, for example after a build that changed the filter.
- **Prerequisites:** Home page is open and no filters are applied.
- **Steps:**
  1. Click **Power Tools**.
  2. Confirm that Grinder, Sander, Saw and Drill are now checked.
  3. Click **Power Tools** again.
- **Expected Result:** After step 1, only power-tool products are shown. After step 3, every category checkbox is unchecked and the grid shows the full, unfiltered list again. The first card is "Combination Pliers".

### TC_SAN_002: Unchecking all children unchecks the parent (AC13)
- **Test Type:** Sanity
- **Objective:** Run a quick check of the rule that unchecking all children unchecks the parent.
- **Prerequisites:** **Power Tools** is checked, so all 4 of its children are checked.
- **Steps:**
  1. Uncheck **Grinder**, **Sander**, **Saw** and **Drill**, one at a time.
- **Expected Result:** **Power Tools** becomes unchecked as soon as the last child is unchecked.

---

## 3. Regression Tests

### TC_REG_001: All 3 parents and their children are listed correctly (AC10, AC11)
- **Test Type:** Regression
- **Objective:** Check that the category list matches the expected data and that nothing is missing or duplicated.
- **Prerequisites:** Home page is open.
- **Steps:**
  1. Read every label under **By category:** from top to bottom.
  2. Compare the labels with the tree in the "UI Observed During Exploration" section above.
- **Expected Result:** There are exactly 3 parent categories and 16 child categories. Each child appears under the correct parent. No label appears twice, and no label is blank.

### TC_REG_002: Child categories are indented under their parent (AC11)
- **Test Type:** Regression
- **Objective:** Check that the tree layout is visible on screen.
- **Prerequisites:** Home page is open.
- **Steps:**
  1. Look at **Hand Tools** and the item directly below it, **Hammer**.
  2. Compare how far each one is from the left edge.
  3. Repeat this check for **Power Tools** with **Grinder**, and for **Other** with **Tool Belts**.
- **Expected Result:** Every child checkbox is indented to the right of its parent and is grouped directly beneath it.

### TC_REG_003: Parent selection works for every parent (AC12)
- **Test Type:** Regression
- **Objective:** Make sure the cascade from parent to children works for all parents, not only the first one.
- **Prerequisites:** Home page is open and no filters are applied.
- **Steps:**
  1. Check **Hand Tools**. Record which checkboxes are checked and which products appear. Then uncheck **Hand Tools**.
  2. Repeat step 1 for **Power Tools**.
  3. Repeat step 1 for **Other**.
- **Expected Result:** For each parent, every one of its children becomes checked, and no child of any other parent changes. The grid shows only products from that parent's children.

### TC_REG_004: Pagination works after filtering by a parent (AC12)
- **Test Type:** Regression
- **Objective:** Check that a filtered result spread over several pages pages through correctly.
- **Prerequisites:** **Hand Tools** is checked. The grid shows pagination controls.
- **Steps:**
  1. Click page **2** in the pagination controls.
  2. Look at the products shown.
  3. Go back to page **1**.
- **Expected Result:** Page 2 shows only hand-tool products and none that were already on page 1. All category checkboxes keep the same state while you change pages.

### TC_REG_005: Partial uncheck leaves the parent checked and narrows the grid (AC13)
- **Test Type:** Regression
- **Objective:** Record how the site currently behaves when only some children are unchecked. The AC does not define this case.
- **Prerequisites:** **Hand Tools** is checked.
- **Steps:**
  1. Uncheck **Hammer** only.
  2. Look at the **Hand Tools** checkbox and at the product grid.
- **Expected Result:** **Hand Tools** stays checked, which is what the site does today. No hammer products appear in the grid. The other hand-tool products are still shown.
- **Note:** The AC does not say whether the parent should stay checked, become unchecked, or show a partial (indeterminate) state. A Product Owner should confirm the intended behavior.

---

## 4. Integration Tests

### TC_INT_001: Category filter combined with a brand filter (AC12)
- **Test Type:** Integration
- **Objective:** Check that the category filter and the brand filter work together.
- **Prerequisites:** Home page is open and no filters are applied.
- **Steps:**
  1. Check **Hand Tools**.
  2. Under **By brand:**, check **ForgeFlex Tools**.
- **Expected Result:** The grid shows only products that are hand tools **and** made by ForgeFlex Tools. All Hand Tools child checkboxes stay checked.

### TC_INT_002: Category filter combined with sorting (AC12)
- **Test Type:** Integration
- **Objective:** Check that changing the sort order keeps the category filter in place.
- **Prerequisites:** **Power Tools** is checked.
- **Steps:**
  1. In the **Sort** dropdown, choose "Price (Low - High)".
- **Expected Result:** The 5 power-tool products are shown in order of increasing price. The category checkboxes do not change.

### TC_INT_003: Category filter combined with the eco-friendly filter (AC12)
- **Test Type:** Integration
- **Objective:** Check that the category filter and the eco-friendly filter work together.
- **Prerequisites:** Home page is open and no filters are applied.
- **Steps:**
  1. Check **Other**.
  2. Under **Sustainability:**, check **Show only eco-friendly products**.
- **Expected Result:** The grid shows only eco-friendly products from the children of **Other**. If there are none, the message "There are no products found." is shown.

### TC_INT_004: Product details page matches the selected category (AC12)
- **Test Type:** Integration
- **Objective:** Check that a filtered product really belongs to the selected category.
- **Prerequisites:** **Power Tools** is checked.
- **Steps:**
  1. Click the product card "Circular Saw".
  2. On the product details page, read the category label.
- **Expected Result:** The product details page shows the category as Saw, a child of Power Tools.

---

## 5. Unit-Level Business Logic

### TC_UNIT_001: Checking a parent checks only its own children (AC12)
- **Test Type:** Unit
- **Objective:** Check the rule that a parent checkbox affects only its own children.
- **Prerequisites:** No filters are applied.
- **Steps:**
  1. Check **Power Tools**.
  2. Count the checked boxes under Power Tools, Hand Tools and Other.
- **Expected Result:** Exactly 5 boxes are checked: Power Tools, Grinder, Sander, Saw and Drill. No box under Hand Tools or Other is checked.

### TC_UNIT_002: Parent becomes unchecked only when the last child is unchecked (AC13)
- **Test Type:** Unit
- **Objective:** Find the exact point at which the parent changes state.
- **Prerequisites:** **Hand Tools** is checked, so all 7 of its children are checked.
- **Steps:**
  1. Uncheck the children in this order: Hammer, Hand Saw, Wrench, Screwdriver, Pliers, Chisels. Look at **Hand Tools** after each one.
  2. Uncheck **Measures**, the last child still checked.
- **Expected Result:** During step 1, **Hand Tools** stays checked after each uncheck. Immediately after step 2, **Hand Tools** becomes unchecked.

### TC_UNIT_003: Checking all children by hand checks the parent (AC12/AC13 reverse rule)
- **Test Type:** Unit
- **Objective:** Check the reverse of AC13: checking every child should check the parent.
- **Prerequisites:** No filters are applied.
- **Steps:**
  1. Check **Grinder**, **Sander**, **Saw** and **Drill**, one at a time.
- **Expected Result:** **Power Tools** becomes checked automatically after the 4th child is checked.

---

## 6. Positive Scenarios

### TC_POS_001: Category checkboxes are shown and can be clicked (AC10)
- **Test Type:** Positive
- **Objective:** Check that every category checkbox responds to a click.
- **Prerequisites:** Home page is open.
- **Steps:**
  1. Click the label text **Hammer**, not the box itself.
  2. Click the label text **Hammer** again.
- **Expected Result:** The first click checks the box. The second click unchecks it. Clicking the label works the same way as clicking the box.

### TC_POS_002: The tree has parent and child levels (AC11)
- **Test Type:** Positive
- **Objective:** Check that the filter has a two-level parent and child structure.
- **Prerequisites:** Home page is open.
- **Steps:**
  1. Look at the **By category:** list.
- **Expected Result:** **Hand Tools**, **Power Tools** and **Other** are at the top level. Each one has its children listed directly beneath it.

### TC_POS_003: Parent selection checks all children and shows matching products (AC12)
- **Test Type:** Positive
- **Objective:** Check the full happy path for AC12.
- **Prerequisites:** No filters are applied.
- **Steps:**
  1. Check **Power Tools**.
- **Expected Result:** Grinder, Sander, Saw and Drill are all checked. The grid shows "Sheet Sander", "Belt Sander", "Circular Saw", "Cordless Drill 24V" and "Cordless Drill 12V". It shows no hand tools and no products from Other.

### TC_POS_004: Unchecking all children unchecks the parent and resets the grid (AC13)
- **Test Type:** Positive
- **Objective:** Check the full happy path for AC13.
- **Prerequisites:** **Hand Tools** is checked.
- **Steps:**
  1. Uncheck all 7 children of Hand Tools, one at a time.
- **Expected Result:** **Hand Tools** is unchecked. No category is checked anywhere in the list. The grid goes back to the full, unfiltered product list.

---

## 7. Negative Scenarios

### TC_NEG_001: Filter is not shown on pages other than the overview (AC10)
- **Test Type:** Negative
- **Objective:** Check that the category sidebar appears only on the product overview page, as the AC requires.
- **Prerequisites:** None.
- **Steps:**
  1. From the home page, click any product card to open its details page.
  2. Open the **Contact** page from the top menu.
- **Expected Result:** Neither page shows the **By category:** filter sidebar.

### TC_NEG_002: Children do not appear at the parent level (AC11)
- **Test Type:** Negative
- **Objective:** Make sure the tree is not flattened.
- **Prerequisites:** Home page is open.
- **Steps:**
  1. Look at the indentation of **Saw**, a child of Power Tools, and **Hand Saw**, a child of Hand Tools.
- **Expected Result:** Neither appears at the same indentation as the parent categories. Each one is shown only under its own parent.

### TC_NEG_003: Checking a child does not check its parent (AC12)
- **Test Type:** Negative
- **Objective:** Make sure the cascade only goes from parent to children, not from a single child to its parent.
- **Prerequisites:** No filters are applied.
- **Steps:**
  1. Check **Hammer** only.
- **Expected Result:** **Hand Tools** stays unchecked. None of the other Hand Tools children are checked. The grid shows only the 7 hammer products, including "Claw Hammer", "Thor Hammer" and "Sledgehammer".

### TC_NEG_004: Parent with no matching products shows an empty-state message (AC12)
- **Test Type:** Negative
- **Objective:** Check how the site handles a category that has no products.
- **Prerequisites:** No filters are applied.
- **Steps:**
  1. Check **Workbench**.
- **Expected Result:** The grid is empty and the message "There are no products found." is shown. The page shows no error and the layout does not break.

### TC_NEG_005: Unchecking only some children keeps the parent checked (AC13)
- **Test Type:** Negative
- **Objective:** Check that the parent does **not** become unchecked while any child is still checked.
- **Prerequisites:** **Power Tools** is checked.
- **Steps:**
  1. Uncheck **Grinder**, **Sander** and **Saw**, but leave **Drill** checked.
- **Expected Result:** **Power Tools** is still checked, which matches the current behavior. The grid shows only the drill products, "Cordless Drill 24V" and "Cordless Drill 12V".

### TC_NEG_006: Unchecking children of one parent does not affect another parent (AC13)
- **Test Type:** Negative
- **Objective:** Make sure parent state is tracked separately for each parent.
- **Prerequisites:** **Hand Tools** and **Power Tools** are both checked.
- **Steps:**
  1. Uncheck all 7 children of **Hand Tools**.
- **Expected Result:** **Hand Tools** becomes unchecked. **Power Tools** and all 4 of its children stay checked. The grid shows only power-tool products.

### TC_NEG_007: Clicking a checkbox rapidly leaves it in a consistent state (AC12, AC13)
- **Test Type:** Negative
- **Objective:** Check that fast repeated clicks do not leave the filter out of sync with the grid.
- **Prerequisites:** No filters are applied.
- **Steps:**
  1. Click **Hand Tools** 5 times quickly.
  2. Wait 3 seconds.
- **Expected Result:** **Hand Tools** ends up checked, because 5 is an odd number of clicks. All 7 of its children are checked too. The grid shows only hand-tool products, with no duplicates and no stale results.

---

## Traceability Matrix

| AC | Positive | Negative | Other coverage |
|---|---|---|---|
| AC10 | TC_POS_001, TC_SMOKE_001 | TC_NEG_001 | TC_REG_001 |
| AC11 | TC_POS_002 | TC_NEG_002 | TC_REG_001, TC_REG_002 |
| AC12 | TC_POS_003, TC_SMOKE_002 | TC_NEG_003, TC_NEG_004, TC_NEG_007 | TC_SAN_001, TC_REG_003, TC_REG_004, TC_INT_001–004, TC_UNIT_001, TC_UNIT_003 |
| AC13 | TC_POS_004 | TC_NEG_005, TC_NEG_006 | TC_SAN_002, TC_REG_005, TC_UNIT_002 |

## Open Question for the Product Owner
- **Partial selection:** AC13 covers only the case where *all* children are unchecked. When only some children are checked, the site currently keeps the parent fully checked. It does not show a partial (indeterminate) state. Please confirm whether this is the intended behavior.
