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
      link: "spring/",
      children: "structure",
    },
    {
      text: "生活",
      icon: "eye",
      prefix: "live/",
      link: "live/",
      children: "structure",
    },
    "slides",
  ],
});
