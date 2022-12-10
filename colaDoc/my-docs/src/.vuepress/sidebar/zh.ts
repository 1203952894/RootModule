import {sidebar} from "vuepress-theme-hope";

export const zhSidebar = sidebar({
  "/zh/": [
    "",
    {
      icon: "discover",
      text: "案例",
      prefix: "demo/",
      link: "demo/",
      children: "structure",
    },
    {
      text: "Spring",
      icon: "activity",
      prefix: "spring/",
      children: "structure",
    },
    {
      text: "生活",
      icon: "eye",
      prefix: "live/",
      children: "structure",
    },
    "slides",
  ],
});
