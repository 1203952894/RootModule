import {navbar} from "vuepress-theme-hope";

export const zhNavbar = navbar([
  "/zh/",
  {
    text: "案例",
    icon: "discover",
    link: "/zh/demo/"
  },
  {
    text: "Spring",
    icon: "discover",
    link: "/zh/spring/"
  },
  {
    text: "生活",
    icon: "people",
    prefix: "/zh/live/",
    children: [
      {
        text: "Note",
        icon: "alias",
        prefix: "note/",
        children: ["note01", {text: "...", icon: "more", link: ""}],
      },
      {
        text: "Study",
        icon: "study",
        prefix: "study/",
        children: ["study01", {text: "...", icon: "more", link: ""}],
      },
    ],
  },
]);
