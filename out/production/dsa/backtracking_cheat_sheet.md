# 🧠 BACKTRACKING CHEAT SHEET

---

## 1️⃣ Core Question
> At a recursion level, how many choices can start a branch?

- **2 choices** → Pick / Don’t-pick (binary)
- **Many choices** → Loop over candidates (multi-branch)

---

## 2️⃣ Backtracking Pattern
```text
choose
recurse
un-choose
