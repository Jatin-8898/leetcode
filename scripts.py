import requests
from bs4 import BeautifulSoup as bs
import sys

directory = sys.argv[1]
new_name = directory[7:-5]
new_str = ''

for index, e in enumerate(new_name[:-1]):
    if new_name[index+1].isupper():
        new_str += e
        new_str += '-'
    else:
        e = e.lower()
        new_str += e
new_str += new_name[-1]
print(new_str)

data = {"operationName": "questionData", "variables": {"titleSlug": new_str}, "query": "query questionData($titleSlug: String!) {\n  question(titleSlug: $titleSlug) {\n    questionId\n    questionFrontendId\n    boundTopicId\n    title\n    titleSlug\n    content\n    translatedTitle\n    translatedContent\n    isPaidOnly\n    difficulty\n    likes\n    dislikes\n    isLiked\n    similarQuestions\n    contributors {\n      username\n      profileUrl\n      avatarUrl\n      __typename\n    }\n    langToValidPlayground\n    topicTags {\n      name\n      slug\n      translatedName\n      __typename\n    }\n    companyTagStats\n    codeSnippets {\n      lang\n      langSlug\n      code\n      __typename\n    }\n    stats\n    hints\n    solution {\n      id\n      canSeeDetail\n      __typename\n    }\n    status\n    sampleTestCase\n    metaData\n    judgerAvailable\n    judgeType\n    mysqlSchemas\n    enableRunCode\n    enableTestMode\n    envInfo\n    libraryUrl\n    __typename\n  }\n}\n"}

r = requests.post('https://leetcode.com/graphql', json=data).json()
# print(r)
soup = bs(r['data']['question']['content'], 'lxml')
title = r['data']['question']['title']
id = r['data']['question']['questionFrontendId']
difficulty = r['data']['question']['difficulty']
title_slug = r['data']['question']['titleSlug']
new_url = 'https://leetcode.com/problems/' + title_slug + '/'
question = soup.get_text().replace('\n', ' ')
# print(title + '\n')
# print(id + " " + difficulty)
# print(new_url)
# print(sys.argv[1])

print("| " + id + " | [" + title + "](" +
      new_url + ") " + "| [Java](" + directory+") | " + difficulty)
